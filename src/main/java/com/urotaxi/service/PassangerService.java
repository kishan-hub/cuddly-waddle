package com.urotaxi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urotaxi.entities.PassangerData;
import com.urotaxi.form.PassangerDataForm;
import com.urotaxi.repositories.RegisterationRepository;
import com.urotaxi.repositories.SaveDetailsRepository;

@Service
@Transactional
public class PassangerService {
	
	private SaveDetailsRepository saveDetailsRepository;
	
	private RegisterationRepository registerationRepository;
  
	
	public int savePassanger(PassangerDataForm passangerDto)
	{
		PassangerData data=null;
		data =new PassangerData();
		data.setName(passangerDto.getName());
		data.setMessage(passangerDto.getMessage());
		data.setPhoneNo(Integer.parseInt(passangerDto.getPhoneNo()));
		//data=saveDetailsRepository.save(data);
		
		return data.getPassanger_no();
	}
	
//	public int saveUser(RegisterUserForm userDto) {
//		Registeration data =null;
//	    
//		data =new Registeration();
//		BeanUtils.copyProperties(userDto, data);
//		data=registerationRepository.save(data);
//		
//		return data.getUserId();
//	
//	}
}
