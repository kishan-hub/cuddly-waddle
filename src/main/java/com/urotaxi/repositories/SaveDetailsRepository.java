package com.urotaxi.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.urotaxi.entities.PassangerData;
import com.urotaxi.service.PassangerService;



public class SaveDetailsRepository {
   
	@Autowired(required = true)
	private static SessionFactory sessionFactory;
	
	private PassangerService passangerService;
	
	public int save(PassangerData passangerData) {
		 
		//create the session
		Session session =null;
		int passanger_no=0;
		session =sessionFactory.openSession();
		
		//save the passangerData
		passanger_no=(int) session.save(passangerData);
		return passanger_no;
		
	}
	
	
  
	
}
