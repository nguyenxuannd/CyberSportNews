package com.cbn.cybersportnews.service;

import java.util.List;
import java.util.Optional;

import com.cbn.cybersportnews.Entities.UserApp;


public interface UserAppServiceInterface {
public List<UserApp> getAllUserApp();
public Optional<UserApp> getUserApp(Integer id);
public Boolean insertUserApp(UserApp userApp);
public Boolean updateUserApp(UserApp userApp);
public void deleteUserApp(UserApp userApp);
public Boolean existUser(Integer id);
public Boolean login(UserApp userApp);
}
