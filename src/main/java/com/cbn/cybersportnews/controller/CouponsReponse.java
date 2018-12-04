package com.cbn.cybersportnews.controller;

import javax.persistence.Column;

public class CouponsReponse {
	private Integer id;
	private String disCount;
	private CompanyReponse company;
	
	public CompanyReponse getCompany() {
		return company;
	}
	public void setCompany(CompanyReponse company) {
		this.company = company;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDisCount() {
		return disCount;
	}
	public void setDisCount(String disCount) {
		this.disCount = disCount;
	}
	
	
}
