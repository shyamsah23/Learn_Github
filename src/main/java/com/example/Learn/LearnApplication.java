package com.example.Learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
		System.out.println("Message from first Branch");
		System.out.println("Message from seond Branch");
		System.out.println("Message from third four");
	}

}
