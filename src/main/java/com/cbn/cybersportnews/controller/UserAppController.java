package com.cbn.cybersportnews.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cbn.cybersportnews.Entities.UserApp;
import com.cbn.cybersportnews.service.UserAppServiceInterface;

@RestController
public class UserAppController {
	@Autowired
	UserAppServiceInterface userAppServiceInterface;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public List<UserApp> viewList() {
		
		return userAppServiceInterface.getAllUserApp();
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public Optional<UserApp> viewUser() {
		return userAppServiceInterface.getUserApp(1);
	}
	
	@PostMapping(value="/insert")
	public Boolean insertUser(@RequestBody UserApp userApp) {
		userAppServiceInterface.insertUserApp(userApp);
		return  true;
	}
	
	@PutMapping("/update")
	public Boolean updateUser(@RequestBody UserApp userApp) {
		userAppServiceInterface.updateUserApp(userApp);
		return true;
	}
}
