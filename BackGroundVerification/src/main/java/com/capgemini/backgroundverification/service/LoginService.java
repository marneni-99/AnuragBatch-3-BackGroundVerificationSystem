package com.capgemini.backgroundverification.service;

import java.util.List;

import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;

public interface LoginService {

	LoginData addUser(LoginData u);


	List<LoginData> getAllUsers();

	LoginData deleteUser(int userId);

	LoginData updateUser(LoginData u);
	
	String loginUser(LoginData u);
	
	Verification addVer(Verification u);

}