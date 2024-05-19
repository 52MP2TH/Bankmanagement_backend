package com.example.bankLoanSystem.model;



import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Loan_Table")

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private String loanType;
	private long loanAmount;
	private Date date;
	private int rateOfInterest;
	private int durationOfLoan;
	private int userId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "personalLoan_id", referencedColumnName = "id")
	private PersonalLoan personalLoan;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "educationLoan_id", referencedColumnName = "id")
	private EducationLoan educationLoan;

	public PersonalLoan getPersonalLoan() {
		return personalLoan;
	}

	public void setPersonalLoan(PersonalLoan personalLoan) {
		this.personalLoan = personalLoan;
	}

	public EducationLoan getEducationLoan() {
		return educationLoan;
	}

	public void setEducationLoan(EducationLoan educationLoan) {
		this.educationLoan = educationLoan;
	}

	

	public Loan(int loanId, String loanType, long loanAmount, Date date, int rateOfInterest, int durationOfLoan,
			int userId, PersonalLoan personalLoan, EducationLoan educationLoan) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.date = date;
		this.rateOfInterest = rateOfInterest;
		this.durationOfLoan = durationOfLoan;
		this.userId = userId;
		this.personalLoan = personalLoan;
		this.educationLoan = educationLoan;
	}

	public Loan() {
		super();
	}

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

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", date=" + date
				+ ", rateOfInterest=" + rateOfInterest + ", durationOfLoan=" + durationOfLoan + ", userId=" + userId
				+ ", personalLoan=" + personalLoan + ", educationLoan=" + educationLoan + "]";
	}

	public Loan(String loanType, long loanAmount, Date date, int rateOfInterest, int durationOfLoan, int userId) {
		super();
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.date = date;
		this.rateOfInterest = rateOfInterest;
		this.durationOfLoan = durationOfLoan;
		this.userId = userId;
	}

	

}
