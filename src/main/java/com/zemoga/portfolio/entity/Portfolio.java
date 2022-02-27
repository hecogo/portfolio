package com.zemoga.portfolio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio implements Serializable{

	private static final long serialVersionUID = 7651762084771074822L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 21844)
	private String experience;
	@Column(length = 255, name="imagePath")
	private String imagePath;
	@Column(length = 255)
	private String name;
	@Column(length = 255)
	private String twitterUser;
	@Column(length = 255)
	private String email;
	@Column(length = 255)
	private String address;
	@Column(length = 255)
	private String phone;
	@Column(length = 255)
	private String zipCode;
	
	public Long getId() {
		return id;
	}
	
	public String getExperience() {
		return experience;
	}
	public String getImagePath() {
		return imagePath;
	}
	public String getName() {
		return name;
	}
	public String getTwitterUser() {
		return twitterUser;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getZipCode() {
		return zipCode;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTwitterUser(String twitterUser) {
		this.twitterUser = twitterUser;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}