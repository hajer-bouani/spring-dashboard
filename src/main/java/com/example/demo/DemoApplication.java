package com.example.demo;

import com.example.demo.Repository.RoleRepository;
import com.example.demo.model.Role;
import com.example.demo.model.RoleName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
