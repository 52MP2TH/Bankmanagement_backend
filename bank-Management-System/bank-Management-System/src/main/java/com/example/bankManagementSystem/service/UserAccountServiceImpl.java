package com.example.bankManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankManagementSystem.exception.UserException;
import com.example.bankManagementSystem.model.User;
import com.example.bankManagementSystem.repository.UserAccountRepository;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	public UserAccountRepository repo;

	@Override
	public User updateUser(User user) {
		System.out.println(user);
		User upUser = repo.findByUsername(user.getUsername()); 
		if(upUser == null) {
			
//			upUser.setname(user.getname());
//			upUser.setUsername(user.getUsername());
////		upUser.setPassword(user.getPassword());
//			upUser.setAddress(user.getAddress());
//			upUser.setPan(user.getPan());
//			upUser.setAadhar(user.getAadhar());
//			upUser.setContactnumber(user.getContactnumber());
//			upUser.setCountry(user.getCountry());
//			upUser.setEmail(user.getEmail());
//			upUser.setDob(user.getDob());
			
			throw new UserException("User not found");
		}
		return repo.save(user);
	}

	@Override
	public User addUser(User user) {
		return repo.save(user);
	}

	@Override
	public User getUsers(int uId) {
		
		return repo.findById(uId).get();
	}

}
