package com.example.demoJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DemoJpaApplication.class, args);
		StudentService ss = ac.getBean(StudentService.class);
		
		ss.display();
		
	}

}
