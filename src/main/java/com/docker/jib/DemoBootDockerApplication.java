package com.docker.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBootDockerApplication.class, args);
	}
	@GetMapping("/")
	public String sayHello(){
		return "Hello Spring boot Docker";
	}



}
