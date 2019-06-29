package com.gfg.consumeRest.fetchApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FetchApiApplication {

	private static final Logger log = LoggerFactory.getLogger(FetchApiApplication.class);
	public static void main(String[] args) {


		SpringApplication.run(FetchApiApplication.class, args);

	}
	//@Bean
	//public RestTemplate restTemplate(RestTemplateBuilder builder) {
	//	return builder.build();
	//}

}
