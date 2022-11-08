package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.example.demo.sevice.GreetingService;
import com.example.demo.sevice.OutputService;
import com.example.demo.sevice.TimeService;

public class ApplicationConfig {
	@Value("Hello")
	private String greeting;
	
	@Autowired
	private GreetingService greetingService;
	@Autowired
	private TimeService timeService;
	
	@Bean
	public TimeService timeservice()
	{
		return new TimeService(true);
	}
	
	@Bean
	public OutputService outputService()
	{
		return new OutputService(greetingService, timeService);
	}
	
	@Bean
	public GreetingService greetingService()
	{
		return new GreetingService("Hello");
	}

}
