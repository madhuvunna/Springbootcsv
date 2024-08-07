package com.example.madhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.madhu.model.Customer;

@SpringBootApplication
public class MadhuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MadhuApplication.class, args);
	}
//		@Override
//		public void run(String...m) {
//			Customer cust = new Customer();
//			cust.setId("Customer id");
//			cust.setFirstName("Customer firstname");
//			cust.setLastName("Customer lastname");
		
}
