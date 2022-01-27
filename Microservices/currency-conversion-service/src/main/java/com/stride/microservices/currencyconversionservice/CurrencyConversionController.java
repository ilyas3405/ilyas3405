package com.stride.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	
	@RequestMapping("currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable("from") String from, 
			@PathVariable("to") String to, 
			@PathVariable("quantity") BigDecimal quantity ) {
		
		HashMap<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity
		("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables );
		CurrencyConversion currencyConversion =  responseEntity.getBody();
	 	
		return new CurrencyConversion(currencyConversion.getId(), from, to, quantity, 
					currencyConversion.getConversionMultiple(), 
					quantity.multiply(currencyConversion.getConversionMultiple()), 
					currencyConversion.getEnvironment() + " from restTemplate");
		
	}
	
	
	@RequestMapping("currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversionFeign(@PathVariable("from") String from, 
			@PathVariable("to") String to, 
			@PathVariable("quantity") BigDecimal quantity ) {
		
		CurrencyConversion currencyConversion = currencyExchangeProxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversion(currencyConversion.getId(), from, to, quantity, 
					currencyConversion.getConversionMultiple(), 
					quantity.multiply(currencyConversion.getConversionMultiple()), 
					currencyConversion.getEnvironment() + " from feign client");
		
	}
	
}
