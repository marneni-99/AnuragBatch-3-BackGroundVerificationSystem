package com.capgemini.backgroundverification.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.backgroundverification.dao.VerificationRepository;
import com.capgemini.backgroundverification.entity.Verification;


@Service
public class VerificationService
{
	@Autowired
	VerificationRepository vdao;
	public void setAdao(VerificationRepository vdao) { this.vdao=vdao;}
	
	@Transactional(readOnly=true)
	public Verification checkStatus(int userId)
	{
		return vdao.findById(userId).get();
	}
	
	
	@Transactional
	public Verification setStatus(Verification v)
	{
		Verification a=vdao.save(v);
		return a;
	}

	
}
