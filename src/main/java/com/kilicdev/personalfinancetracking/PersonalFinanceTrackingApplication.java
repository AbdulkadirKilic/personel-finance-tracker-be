package com.kilicdev.personalfinancetracking;

import com.kilicdev.personalfinancetracking.dto.UserDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalFinanceTrackingApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceTrackingApplication.class, args);
		UserDTO dto = new UserDTO();
		dto.setId(1L);
		dto.setName("deneme");
		dto.setEmail("a@gmail.com");
		System.out.println(dto);
	}
}
