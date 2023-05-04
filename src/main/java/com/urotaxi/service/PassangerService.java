package com.urotaxi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.urotaxi.entities.PassangerData;
import com.urotaxi.form.PassangerDataForm;
import com.urotaxi.repositories.RideRepository;
import com.urotaxi.repositories.SaveDetailsRepository;

@Service
public class PassangerService {
	
	private SaveDetailsRepository saveDetailsRepository;
  
	
	public int savePassanger(PassangerDataForm passangerDto)
	{
		PassangerData data=null;
		data =new PassangerData();
		BeanUtils.copyProperties(passangerDto, data);
		
		data=saveDetailsRepository.save(data);
		
		return data.getPassanger_no();
	}
	
}
