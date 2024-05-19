package com.example.bankLoanSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankLoanSystem.model.EducationLoan;

@Repository
public interface EducationLoanRepository extends JpaRepository<EducationLoan, Integer>{
	
	
}
