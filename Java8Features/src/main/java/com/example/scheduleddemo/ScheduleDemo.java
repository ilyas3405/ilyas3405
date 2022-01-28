package com.example.scheduleddemo;

import java.util.Collections;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.lang.Thread;


@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class ScheduleDemo {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleDemo.class);

	public static void main(String[] args) {
		SpringApplication.run(ScheduleDemo.class, args);
		LOGGER.info("spring boot working for me !!");
	}
	
	@Bean
	ApplicationRunner applicationRunner(MyProperties myProperties) {
		
		
		return aaa -> System.out.println(myProperties);
			 
				
	}
	

	@Scheduled(initialDelay = 1000L, fixedDelayString = "${JOB_DELAY_TIME}")
	void someJob() {
		LOGGER.info("Now is" + new Date());
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Scheduled(initialDelay = 1000L, fixedDelayString = "${JOB_DELAY_TIME}")
	void someJob2() throws InterruptedException {
		LOGGER.info("Some job 2" + new Date());
	}
}

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduling.enabled", matchIfMissing = true)
class SchedulingConfiguration {

}