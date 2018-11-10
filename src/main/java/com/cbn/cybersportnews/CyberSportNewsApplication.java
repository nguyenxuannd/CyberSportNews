package com.cbn.cybersportnews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbn.cybersportnews.service.UserAppServiceInterface;

@SpringBootApplication
public class CyberSportNewsApplication implements CommandLineRunner {

	@Autowired
	UserAppServiceInterface userAppServiceInterface;  
	public static void main(String[] args) {
		SpringApplication.run(CyberSportNewsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userAppServiceInterface.getAllUserApp().get(0).getFirtName());
		
	}
}
