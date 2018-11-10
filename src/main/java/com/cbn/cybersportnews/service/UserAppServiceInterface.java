package com.cbn.cybersportnews.service;

import java.util.List;

import com.cbn.cybersportnews.Entities.UserApp;


public interface UserAppServiceInterface {
public List<UserApp> getAllUserApp();
public UserApp getUserApp(Integer id);
public Boolean insertUserApp(UserApp userApp);
public Boolean updateUserApp(UserApp userApp);
public Boolean deleteUserApp(UserApp userApp);
}
