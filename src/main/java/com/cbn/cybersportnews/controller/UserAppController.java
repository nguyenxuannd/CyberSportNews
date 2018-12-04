package com.cbn.cybersportnews.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cbn.cybersportnews.Entities.Coupons;
import com.cbn.cybersportnews.Entities.UserApp;
import com.cbn.cybersportnews.service.UserAppServiceInterface;

@RestController
public class UserAppController {
	@Autowired
	UserAppServiceInterface userAppServiceInterface;
	
	
	@Autowired
	
	ModelMapper moodelMapper; 

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public List<UserApp> viewList() {
	
		return userAppServiceInterface.getAllUserApp();
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public UserReponse viewUser(@RequestBody UserApp id) {
		Optional<UserApp> userApp=userAppServiceInterface.getUserApp(id);
		System.out.println(userApp.get().getListCoupons().get(0).getCompany().getId() );
		UserReponse udto=null;
		udto=moodelMapper.map(userApp, UserReponse.class);
		return udto;
	}
	
	@RequestMapping(value="/usertest", method=RequestMethod.POST)
	public ResponseEntity<UserReponse> viewUsertest(@RequestBody UserApp id) {
		UserApp userApp=userAppServiceInterface.getTestUserApp(id);
		UserReponse ureponse=null;
		ureponse=moodelMapper.map(userApp, UserReponse.class);
		System.out.println(ureponse.toString());
		return new ResponseEntity<UserReponse>(ureponse,HttpStatus.ACCEPTED);
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
	
	@PostMapping("/login")
	public Boolean loginUser(@RequestBody UserApp uApp) {
		System.out.println("cos nul id ko: "+uApp.getId());
		if(userAppServiceInterface.login(uApp)) {
			return true;
		}else {
			return false;
		}
	}
}
