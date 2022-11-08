package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.sevice.OutputService;

@SpringBootApplication      //used to mark main class of spring
public class DemoApplication {

	public static void main(String[] args){
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutputService outputService = context.getBean(OutputService.class);
		
		
		outputService.generateOutput("Sanuja");
			
		
	}

}
