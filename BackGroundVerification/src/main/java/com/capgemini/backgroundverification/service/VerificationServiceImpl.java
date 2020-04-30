package com.capgemini.backgroundverification.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.capgemini.backgroundverification.dao.VerificationDao;
import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;

@Service
@Transactional
public class VerificationServiceImpl implements VerificationService {

	VerificationDao dao;
	@Override
	public Verification addVer(Verification u) {
		// TODO Auto-generated method stub
		return dao.addVer(u);
	}


	}


