package com.capgemini.backgroundverification.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.backgroundverification.entity.LoginData;
import com.capgemini.backgroundverification.entity.Verification;

@Repository
public class VerificationDaoImpl implements VerificationDao{

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Verification addVer(Verification u) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			Verification e=em.merge(u);
			return e;
		}
	}


