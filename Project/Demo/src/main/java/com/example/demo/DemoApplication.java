package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		Home h=context.getBean(Home.class);//get
		h.connect();
		Home h2=context.getBean(Home.class);
	}

}
