package com.example.bankLoanSystem.service;

import java.util.List;

import com.example.bankLoanSystem.model.Loan;


public interface LoanService {

	Loan updateLoan(int id, Loan loan);

	Loan addLoan(Loan loan);

	List<Loan> getLoans(int userid);

}
