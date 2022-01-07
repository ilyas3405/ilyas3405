package com.chartercomm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.core.joran.conditional.ElseAction;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SwaggerApplication.class, args);

		// Stream<String> stream = Stream.of("red","blue","green","yellow","brown");
		// somenewmethod(stream);

		List<String> names = Arrays.asList("Shoeb","Priya","anto");


	}



	private static void somenewmethod(Stream<String> stream) {
		stream.forEach(e -> System.out.println(e));
		stream.forEach(System.out::println);
	}


	@Bean
	public Docket swaggerConfiguration() {
	return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.paths(PathSelectors.ant("/api/*"))
		.apis(RequestHandlerSelectors.basePackage("com.chartercomm"))
		.build()
		.apiInfo(apiDetails());

	}
	

	private ApiInfo apiDetails() {

		return new ApiInfo(
			"Address book API", 
			"Sample API for testing Swagger ", 
			"1.0", 
			"Free to use", 
			new springfox.documentation.service.Contact("ahmed shahab","http://google.com", "ab@g.com"), 
			"API License",
			"http://chartercomm.com",
			Collections.emptyList());
	}

}
