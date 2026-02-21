package com.test4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test4Application {

	public static void main(String[] args) {
		String name = "mike";
		int x = 100;
		boolean isPresent=false;
		int y = 200;
		char z = 'a';
		double k = 10.3;
		float m = 10.3f;
		char ch = 'x';
		boolean isSubscribed = true;
		char i='n';
		
		SpringApplication.run(Test4Application.class, args);
	}

}
