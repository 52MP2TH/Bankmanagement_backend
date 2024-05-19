package com.example.bankLoanSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PersonalLoan {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double annualIncome;  
	private String companyName;
	private String designation;
	private String totalExperience;
	private String currentCompanyExperience;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getCurrentCompanyExperience() {
		return currentCompanyExperience;
	}

	public void setCurrentCompanyExperience(String currentCompanyExperience) {
		this.currentCompanyExperience = currentCompanyExperience;
	}

	
	
	public PersonalLoan() {
		
	}
	
	
	public PersonalLoan(double annualIncome, String companyName, String designation, String totalExperience,
			String currentCompanyExperience) {
		super();
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentCompanyExperience = currentCompanyExperience;
	}

}
