package com.example.bankLoanSystem.loanController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankLoanSystem.model.EducationLoan;
import com.example.bankLoanSystem.model.Loan;
import com.example.bankLoanSystem.model.LoanRequest;
import com.example.bankLoanSystem.model.PersonalLoan;
import com.example.bankLoanSystem.repository.EducationLoanRepository;
import com.example.bankLoanSystem.repository.PersonalLoanRepository;
import com.example.bankLoanSystem.service.LoanService;


@RestController
@RequestMapping("/loan")
@CrossOrigin(origins = "*")
public class LoanController {
		
		@Autowired
		public LoanService service;
		
		@Autowired
		private EducationLoanRepository educationLoanRepository;
		
		@Autowired
		private PersonalLoanRepository personalLoanRepository;
		
		@PutMapping("/update/{id}")
		public ResponseEntity<Loan> updateLoanDetails(@PathVariable int id, @RequestBody Loan loan) {
			return new ResponseEntity<>(service.updateLoan(id, loan), HttpStatus.OK);
		}
		
		@PostMapping("/addloan")
		public ResponseEntity<Loan> addLoan(@RequestBody LoanRequest loanRequest) {
			System.out.println(loanRequest.toString());
			Loan loan=new Loan(loanRequest.getLoanType(), loanRequest.getLoanAmount(), loanRequest.getDate(), loanRequest.getRateOfInterest(), loanRequest.getDurationOfLoan(), loanRequest.getUserId());
			if(loanRequest.getLoanType().equals("personalLoan")) {
				PersonalLoan personalLoan=personalLoanRepository.save(new  PersonalLoan(loanRequest.getAnnualIncome(), loanRequest.getCompanyName(), loanRequest.getDesignation(), loanRequest.getTotalExperience(), loanRequest.getCurrentCompanyExperience()));
				loan.setPersonalLoan(personalLoan);
			}
			else if (loanRequest.getLoanType().equals("educationLoan")) {
				EducationLoan educationLoan=educationLoanRepository.save(new EducationLoan(loanRequest.getCourseFee(), loanRequest.getCourse(), loanRequest.getFatherName(), loanRequest.getFatherOccupation(), loanRequest.getAnnualIncome()));
				loan.setEducationLoan(educationLoan);
			}
			return new ResponseEntity<>(service.addLoan(loan), HttpStatus.CREATED);
		}

		@GetMapping("/getLoans/{uId}")
		public ResponseEntity<?> getLoans(@PathVariable int uId) throws Exception{
		List<Loan> loans=service.getLoans(uId);
		return new ResponseEntity<List<Loan>>(loans,HttpStatus.OK);
	}
	
	}
