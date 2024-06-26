package com.cts.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "Customer_Table")

@Entity

@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String pan;
	
	@Column(nullable = false, length = 12)
	private Long aadhar;
	
	@Column(nullable = false)
	private Long contactnumber;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String accounttype;
	
	@Column(nullable = false)
	private Date dob;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Long getAadhar() {
		return aadhar;
	}
	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public Customer(int userId, String name, String username, String password, String address, String pan,
			Long contactnumber, String country, String email, String accounttype, Date dob) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.pan = pan;
		this.contactnumber = contactnumber;
		this.country = country;
		this.email = email;
		this.accounttype = accounttype;
		this.dob = dob;
	}
	
	public Customer() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", pan=" + pan + ", contactnumber=" + contactnumber + ", country=" + country
				+ ", email=" + email + ", accounttype=" + accounttype + ", dob=" + dob + "]";
	}
	
	
	
	

}
