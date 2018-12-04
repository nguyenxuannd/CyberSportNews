package com.cbn.cybersportnews.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="Coupons")
public class Coupons {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="discount")
	private String disCount;
	@Column(name="quantity")
	private Integer quantity;
	@ManyToMany(mappedBy="listCoupons",fetch=FetchType.LAZY)
	private List<UserApp> listUserApp =new ArrayList<>();
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="company_id")
	private Company company;
	
	
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@JsonBackReference
	public List<UserApp> getListUserApp() {
		return listUserApp;
	}
	public void setListUserApp(List<UserApp> listUserApp) {
		this.listUserApp = listUserApp;
	}
	
}
