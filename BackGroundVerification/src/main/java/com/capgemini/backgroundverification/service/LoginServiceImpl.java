package com.capgemini.backgroundverification.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;
import com.capgemini.backgroundverification.dao.LoginDaoImpl;

@Service
@Transactional
public class LoginServiceImpl implements LoginService 
{
@Autowired
LoginDaoImpl dao;

@Override
public LoginData addUser(LoginData u) {
	return dao.addUser(u);
}

@Override
public List<LoginData> getAllUsers() 
{
return dao.getAllUsers();
}


@Override
public LoginData deleteUser(int userId) 
{
	return dao.deleteUser(userId);
}

@Override
public LoginData updateUser(LoginData u) {
	return dao.updateUser(u);	
}

@Override
public String loginUser(LoginData u)
{
	return dao.loginUser(u);
}

@Override
public Verification addVer(Verification u) {
	// TODO Auto-generated method stub
	return dao.addVer(u);
}
}