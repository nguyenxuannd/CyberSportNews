package com.cbn.cybersportnews.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import com.cbn.cybersportnews.Entities.Coupons;

public class UserReponse {
	private Integer id;
	
	private String firtName;
	private String lastName;
	private String email;
	private Integer age;
	
	private String nickName;
	private String gender;
	private String picture;
	private List<CouponsReponse> listCoupons = new ArrayList<>();
	
	
	public List<CouponsReponse> getListCoupons() {
		return listCoupons;
	}
	public void setListCoupons(List<CouponsReponse> listCoupons) {
		this.listCoupons = listCoupons;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	
}
