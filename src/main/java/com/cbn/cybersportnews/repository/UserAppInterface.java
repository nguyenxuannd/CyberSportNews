package com.cbn.cybersportnews.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cbn.cybersportnews.Entities.UserApp;

@Repository
public interface UserAppInterface extends JpaRepository<UserApp, Integer> {
	@Query("select u from UserApp u  join fetch  u.listCoupons a   where u.id=?1 ")
	public UserApp findUserAppById(Integer id);
}
