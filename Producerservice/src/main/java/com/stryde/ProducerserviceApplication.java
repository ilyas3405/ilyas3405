package com.stryde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
 

@SpringBootApplication
@EnableEurekaClient 
public class ProducerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerserviceApplication.class, args);
	}

}
