package com.datorium.Datorium.API;


import com.datorium.Datorium.API.DTOs.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@CrossOrigin(origins = "*")

public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("123");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}
}
