package com.gouthaminfotech.Jobs_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JobsInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsInfoApplication.class, args);
	}

}
