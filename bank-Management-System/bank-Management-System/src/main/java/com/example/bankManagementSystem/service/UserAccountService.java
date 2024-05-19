package com.example.bankManagementSystem.service;

import com.example.bankManagementSystem.model.User;


public interface UserAccountService {

	User addUser(User user);

	User getUsers(int uId);

	User updateUser(User user);

}
