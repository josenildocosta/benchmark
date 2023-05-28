package com.study.benchmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BenchmarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenchmarkApplication.class, args);
	}

}
