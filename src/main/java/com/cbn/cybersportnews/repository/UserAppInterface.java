package com.cbn.cybersportnews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cbn.cybersportnews.Entities.UserApp;

@Repository
public interface UserAppInterface extends CrudRepository<UserApp, Integer> {

}
