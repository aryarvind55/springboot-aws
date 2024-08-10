package com.ary.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsApplication.class, args);
	}

	@GetMapping(path = "/welcome")
	public String welcome(){
		return "Spring Boot application deployed to AWS!";
	}


}
