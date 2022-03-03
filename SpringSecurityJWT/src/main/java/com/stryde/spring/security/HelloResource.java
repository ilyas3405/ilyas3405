package com.stryde.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stryde.spring.security.models.AuthenticationRequest;
import com.stryde.spring.security.models.AuthenticationResponse;
import com.stryde.spring.security.services.MyUserDetailsService;
import com.stryde.spring.security.util.JwtUtil;

@RestController
public class HelloResource {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired 
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world from spring security";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {
		try {

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getPassword(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username and password", e);
		}
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

	@RequestMapping("/contactus")
	public String contactus() {
		return "This is contact us page";
	}
}
