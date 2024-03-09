package com.poc.TaskManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class TaskManagementSystemApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =  SpringApplication.run(TaskManagementSystemApplication.class, args);
	}

}
