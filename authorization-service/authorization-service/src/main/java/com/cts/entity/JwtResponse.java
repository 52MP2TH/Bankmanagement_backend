package com.cts.entity;

import lombok.Data;

@Data
public class JwtResponse{

	public JwtResponse(String jwttoken, Customer customer) {
		super();
		this.jwttoken = jwttoken;
		this.customer = customer;
	}
	private String jwttoken;
	private Customer customer;
	
	
	public JwtResponse() {
		
	}
	
	public String getJwttoken() {
		return jwttoken;
	}
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
