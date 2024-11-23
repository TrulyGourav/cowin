package com.gkrooms.cowin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CowinApplication {

	public static void main(String[] args) {
		SpringApplication.run(CowinApplication.class, args);
		System.out.println("\n");
		System.out.println("----------------------------------------------");
		System.out.println("          Cowin Application started ");
		System.out.println("----------------------------------------------");
	}

}
