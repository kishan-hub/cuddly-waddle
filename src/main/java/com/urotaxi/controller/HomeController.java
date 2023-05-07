package com.urotaxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.urotaxi.form.ContactUsForm;
import com.urotaxi.form.PassangerDataForm;
import com.urotaxi.form.RegisterUserForm;
import com.urotaxi.form.RideForm;
import com.urotaxi.repositories.SaveDetailsRepository;
import com.urotaxi.service.ContactUsService;
import com.urotaxi.service.PassangerService;
import com.urotaxi.service.RideService;

@Controller
public class HomeController {
	@Autowired
	private RideService rideService;
	@Autowired
	private ContactUsService contactUsService;
	@Autowired
	private PassangerService passangerService;

	@PostMapping("/bookRide")
	public String bookRide(@ModelAttribute("rideForm") RideForm rideForm, Model model) {
		int rideNo = 0;
		rideNo = rideService.bookRide(rideForm);

		model.addAttribute("rideNo", rideNo);
		 return "ride-details";
	}

	@PostMapping("/contactUs")
	public String enquire(@ModelAttribute("contactUsForm") ContactUsForm contactUsForm, Model model) {
		int contactUsNo = 0;
		
		contactUsNo = contactUsService.saveContactUs(contactUsForm);
		model.addAttribute("contactUsNo", contactUsNo);
		return "enquiry-details";
	}
	
	@PostMapping("/saveDetails")
	public String savePassanger(@ModelAttribute("passangerDataForm") PassangerDataForm passangerDataForm,Model model) {
		
		int passanger_no=0;
		    System.out.println(passangerDataForm);
		passanger_no=passangerService.savePassanger(passangerDataForm);
		model.addAttribute("passanger_no",passanger_no);
		
		return "contact";
	}
	
	@PostMapping("/saveRegister")
	public String SaveRegisteration(@ModelAttribute("registerUserForm") RegisterUserForm registerUserForm,Model model) {
		int user_id=0;
		System.out.println(registerUserForm);
		user_id = passangerService.saveUser(registerUserForm);
		model.addAttribute("user", user_id);
		
		return "contact";
	}
}
