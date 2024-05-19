package com.example.bankLoanSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankLoanSystem.model.PersonalLoan;

@Repository
public interface PersonalLoanRepository extends JpaRepository<PersonalLoan, Integer>{

}
