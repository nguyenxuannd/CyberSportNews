package com.cbn.cybersportnews.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbn.cybersportnews.Entities.UserApp;
import com.cbn.cybersportnews.repository.UserAppInterface;

@Service
public class UserAppService implements UserAppServiceInterface{

	@Autowired
	UserAppInterface userAppInterface; 
	
	@Override
	public List<UserApp> getAllUserApp() {
		// TODO Auto-generated method stub
		return (List<UserApp>) userAppInterface.findAll();
	}

	@Override
	public UserApp getUserApp(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertUserApp(UserApp userApp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUserApp(UserApp userApp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUserApp(UserApp userApp) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
