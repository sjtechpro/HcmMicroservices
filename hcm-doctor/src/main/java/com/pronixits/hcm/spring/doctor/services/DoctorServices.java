package com.pronixits.hcm.spring.doctor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pronixits.hcm.spring.doctor.model.DoctorProfile;
import com.pronixits.hcm.spring.doctor.repository.DoctorRepository;

@Service
public class DoctorServices {
	@Autowired
	DoctorRepository doctorRepository;
	
	public void saveDoctors(DoctorProfile docprofile) {
		doctorRepository.save(docprofile);	
	}

	public List<DoctorProfile> showdoctors() {
		
		return doctorRepository.findAll();
		
	}

}
