package com.bolu.rs.FlightBooking_SpringBoot.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "USER_DETAILS")
public class UserEntity {
	@Id
	@Column(name="userid")
	private String userId;
	private String password;
	private String name;
	private String city;
	private String email;
	private String phone;
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}