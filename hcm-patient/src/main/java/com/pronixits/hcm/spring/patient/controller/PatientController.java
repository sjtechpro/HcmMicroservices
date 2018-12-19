package com.pronixits.hcm.spring.patient.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
 
import org.springframework.http.MediaType;
 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pronixits.hcm.spring.patient.model.DoctorProfile;
import com.pronixits.hcm.spring.patient.model.PatientProfile;
import com.pronixits.hcm.spring.patient.services.PatientServices;

@RestController
public class PatientController {
	
//	String baseUrl="http://localhost:8787";
	
	@Autowired
	PatientServices patientServices;
	
	final RestClient restClient;
	@Autowired
	public PatientController(RestClient restClient) {
		super();
		this.restClient = restClient;
	}

	@RequestMapping(value="/registerPatient")
	public String registerPatient(@RequestBody PatientProfile patientProfile) {
		
		patientServices.savePatient(patientProfile);
		return "patient registered successfully";
	}
	
	@RequestMapping(value="showDoctors", method=RequestMethod.GET)
	public List<DoctorProfile> getDoctors(){
		
		return restClient.showDoctors();
		
	}
	
	/*public ResponseEntity<String> getDoctors() throws RestClientException, IOException{
		String baseUrl="http://localhost:8787/showalldoctors";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception e)
		{
			System.out.println(e);
		}
		return response;
		 
	}*/

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}
