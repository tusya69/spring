package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.core.annotation.Order;


@Component
@Order(1)
public class First implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("First");
	}
}