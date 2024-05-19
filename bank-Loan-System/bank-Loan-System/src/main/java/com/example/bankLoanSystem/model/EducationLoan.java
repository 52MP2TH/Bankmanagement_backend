package com.example.bankLoanSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EducationLoan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double courseFee;  
	private String course;
	private String fatherName;
	private String fatherOccupation;
	private double annualIncome;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getCourseFee() {
		return courseFee;
	}


	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getFatherOccupation() {
		return fatherOccupation;
	}


	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}


	public double getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}


	public EducationLoan() {
		
	}


	public EducationLoan(double courseFee, String course, String fatherName, String fatherOccupation,
			double annualIncome) {
		super();
		this.courseFee = courseFee;
		this.course = course;
		this.fatherName = fatherName;
		this.fatherOccupation = fatherOccupation;
		this.annualIncome = annualIncome;
	}

}
