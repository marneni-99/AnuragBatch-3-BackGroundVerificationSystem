package com.capgemini.backgroundverification.dao;
import java.util.List;

import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;

public interface LoginDao {

	LoginData addUser(LoginData u);

	List<LoginData> getAllUsers();

	LoginData deleteUser(int userId);

	LoginData updateUser(LoginData u);

	String loginUser(LoginData u);
	
	
}