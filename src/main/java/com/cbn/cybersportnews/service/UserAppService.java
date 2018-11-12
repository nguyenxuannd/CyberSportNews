package com.cbn.cybersportnews.service;

import java.util.List;
import java.util.Optional;

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
	public Optional<UserApp> getUserApp(UserApp id){
		// TODO Auto-generated method stub
		return userAppInterface.findById(id.getId());
	}

	@Override
	public Boolean insertUserApp(UserApp userApp) {
		// TODO Auto-generated method stub
	UserApp i=	userAppInterface.save(userApp);
	return (i.equals(userApp)?true:false);
	}

	@Override
	public Boolean updateUserApp(UserApp userApp) {
		UserApp i=	userAppInterface.save(userApp);
		return (i.equals(userApp)?true:false);
	}

	@Override
	public void deleteUserApp(UserApp userApp) {
		userAppInterface.delete(userApp);
	
	}

	@Override
	public Boolean existUser(Integer id) {
		// TODO Auto-generated method stub
		if(id.equals(null)) {
			
			return false;
		}else
		return userAppInterface.existsById(id);
	}

	@Override
	public Boolean login(UserApp userApp) {
		if(existUser(userApp.getId())) {
			Optional<UserApp> userAuthen=getUserApp(userApp);
			System.out.println("id null"+userApp.getPassWord());
			if(userApp.getPassWord().equals(userAuthen.get().getPassWord())) {
				return true;
			}else {
				return false;
			}
		}else {
		return false;
		}
	}

	

}
