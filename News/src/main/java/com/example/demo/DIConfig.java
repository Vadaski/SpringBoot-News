package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan("com.example.demo")
@SpringBootApplication
public class DIConfig {
	public static void main(String[] args) {
		SpringApplication.run(DIConfig.class, args);
	}
}
