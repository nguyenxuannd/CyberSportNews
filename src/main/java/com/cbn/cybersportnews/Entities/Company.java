package com.cbn.cybersportnews.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name = "company")
public class Company {
	@Id
	@GeneratedValue
	private Integer id;
	private String image;
	private String type;
	private String description;
	@OneToMany(mappedBy = "company", fetch=FetchType.LAZY)
	private List<Coupons> listCoupons = new ArrayList<>();

	@JsonBackReference
	public List<Coupons> getListCoupons() {
		return listCoupons;
	}

	public void setListCoupons(List<Coupons> listCoupons) {
		this.listCoupons = listCoupons;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
