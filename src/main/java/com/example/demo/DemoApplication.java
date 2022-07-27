package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Thread; 

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello Masa!";
	}

	@RequestMapping("/warmup")
	String sayYes() {
        try {
            Thread.sleep(50000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }  
		return "Say Yes!!!";
	}

	@RequestMapping("/Loading")
	String loading() {
		return "Laoading...";
	}
}
