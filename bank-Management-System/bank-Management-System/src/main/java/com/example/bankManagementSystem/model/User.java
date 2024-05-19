package com.example.bankManagementSystem.model;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "User_Table")
@Entity
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	private String username;
//	private String password;
	private String address;
	private String pan;
	private String aadhar;
	private Long contactnumber;
	private String country;
	private String email;
	private String accounttype;
	private Date dob;
	
	
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
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
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
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
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
	public User(String name, String username, String password, String address, String pan, Long contactnumber,
			String country, String email, String accountType, Date dob) {
		super();
		this.name = name;
		this.username = username;
//		this.password = password;
		this.address = address;
		this.pan = pan;
		this.contactnumber = contactnumber;
		this.country = country;
		this.email = email;
		this.accounttype = accountType;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", address=" + address
				+ ", pan=" + pan + ", contactnumber=" + contactnumber + ", country=" + country + ", email=" + email
				+ ", accounttype=" + 	accounttype + ", dob=" + dob + "]";
	}
	public User() {
		super();

	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
