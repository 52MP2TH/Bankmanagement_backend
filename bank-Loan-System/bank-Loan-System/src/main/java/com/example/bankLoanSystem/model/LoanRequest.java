package com.example.bankLoanSystem.model;

import java.sql.Date;

public class LoanRequest {

	private int loanId;
	private String loanType;
	private long loanAmount;
	private Date date;
	private int rateOfInterest;
	private int durationOfLoan;
	private int userId;
	private double annualIncome;  
	private String companyName;
	private String designation;
	private String totalExperience;
	private String currentCompanyExperience;
	private double courseFee;  
	private String course;
	private String fatherName;
	private String fatherOccupation;
	
	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getDurationOfLoan() {
		return durationOfLoan;
	}

	public void setDurationOfLoan(int durationOfLoan) {
		this.durationOfLoan = durationOfLoan;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	
	public LoanRequest(int loanId, String loanType, long loanAmount, Date date, int rateOfInterest, int durationOfLoan,
			int userId, double annualIncome, String companyName, String designation, String totalExperience,
			String currentCompanyExperience, double courseFee, String course, String fatherName,
			String fatherOccupation) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.date = date;
		this.rateOfInterest = rateOfInterest;
		this.durationOfLoan = durationOfLoan;
		this.userId = userId;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentCompanyExperience = currentCompanyExperience;
		this.courseFee = courseFee;
		this.course = course;
		this.fatherName = fatherName;
		this.fatherOccupation = fatherOccupation;
		
		
	}

	public LoanRequest() {
	
	}

	@Override
	public String toString() {
		return "LoanRequest [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", date="
				+ date + ", rateOfInterest=" + rateOfInterest + ", durationOfLoan=" + durationOfLoan + ", userId="
				+ userId + ", annualIncome=" + annualIncome + ", companyName=" + companyName + ", designation="
				+ designation + ", totalExperience=" + totalExperience + ", currentCompanyExperience="
				+ currentCompanyExperience + ", courseFee=" + courseFee + ", course=" + course + ", fatherName="
				+ fatherName + ", fatherOccupation=" + fatherOccupation + "]";
	}
	
	
}
