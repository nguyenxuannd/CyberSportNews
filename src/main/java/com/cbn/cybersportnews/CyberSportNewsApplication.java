package com.cbn.cybersportnews;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cbn.cybersportnews.Entities.UserApp;
import com.cbn.cybersportnews.service.UserAppServiceInterface;

@SpringBootApplication
public class CyberSportNewsApplication  {

	@Autowired
	UserAppServiceInterface userAppServiceInterface;  
	public static void main(String[] args) {
		SpringApplication.run(CyberSportNewsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		UserApp u=new UserApp();
		u.setId(1);
		u.setFirtName("Manly");
		u.setLastName("Lopbetoo");
		u.setEmail("linkdan@yahoo.com");
		u.setPassWord("123456");
		u.setAge(27);
		u.setNickName("lampada");
		u.setGender("nu");
		u.setPicture("load.jsp");
		if(userAppServiceInterface.login(u)) {
			System.out.println("ok");
			
		}else {
		System.out.println("---------------: not");
		}
		Optional<UserApp> us=userAppServiceInterface.getUserApp(u);
		
		System.out.println(us.get().getListCoupons().size());
	}*/
}
