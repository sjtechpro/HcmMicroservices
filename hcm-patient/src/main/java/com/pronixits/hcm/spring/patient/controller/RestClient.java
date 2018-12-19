package com.pronixits.hcm.spring.patient.controller;

 
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
 
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pronixits.hcm.spring.patient.model.DoctorProfile;
@Component
@FeignClient("Doctor")
public interface RestClient {
	
	@RequestMapping(value="/showalldoctors")
	 
	List<DoctorProfile> showDoctors();

	
}
