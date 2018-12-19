package com.pronixits.hcm.spring.patient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pronixits.hcm.spring.patient.model.PatientProfile;
import com.pronixits.hcm.spring.patient.repository.PatientRepository;

@Service
public class PatientServices {
	
	@Autowired
	PatientRepository patientRepository;
	
	public void savePatient(PatientProfile patientProfile) {
		patientRepository.save(patientProfile);
		
	}

}
