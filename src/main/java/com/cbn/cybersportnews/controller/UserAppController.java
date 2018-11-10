package com.cbn.cybersportnews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbn.cybersportnews.Entities.UserApp;
import com.cbn.cybersportnews.service.UserAppServiceInterface;

@RestController
public class UserAppController {
	@Autowired
	UserAppServiceInterface userAppServiceInterface;

	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	public List<UserApp> viewList() {
		
		return userAppServiceInterface.getAllUserApp();
	}
}
