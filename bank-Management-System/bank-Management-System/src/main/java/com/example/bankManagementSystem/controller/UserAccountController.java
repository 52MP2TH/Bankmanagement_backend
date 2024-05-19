package com.example.bankManagementSystem.controller;


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

import com.example.bankManagementSystem.model.User;
import com.example.bankManagementSystem.service.UserAccountService;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserAccountController {
	
	@Autowired
	public UserAccountService service;
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		System.out.println(user);
		return new ResponseEntity<>(service.updateUser(user), HttpStatus.OK);
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<>(service.addUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getUsers/{uId}")
	public ResponseEntity<?> getUser(@PathVariable int uId) throws Exception{
		User user=service.getUsers(uId);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
}
