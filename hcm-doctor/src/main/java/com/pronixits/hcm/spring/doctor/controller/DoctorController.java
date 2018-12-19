package com.pronixits.hcm.spring.doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pronixits.hcm.spring.doctor.model.DoctorProfile;
import com.pronixits.hcm.spring.doctor.services.DoctorServices;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorServices doctorServices;
	
	@RequestMapping(value="/savedoctors", method=RequestMethod.POST)
	public String registerDoctors(@RequestBody DoctorProfile docprofile) {
		doctorServices.saveDoctors(docprofile);
		return "registered successfully";
	}
	
	@RequestMapping(value="/showalldoctors", method=RequestMethod.GET)
	public List<DoctorProfile> showDoctors() {
		return doctorServices.showdoctors();
		 
	}
}
