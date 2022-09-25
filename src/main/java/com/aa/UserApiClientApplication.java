package com.aa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiClientApplication.class, args);
	}

}
