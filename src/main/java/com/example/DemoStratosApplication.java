package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoStratosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStratosApplication.class, args);
	}

    @RequestMapping("/demoapp")
    public String get() {
               return "Hello Haytham !!!";
    }
}
