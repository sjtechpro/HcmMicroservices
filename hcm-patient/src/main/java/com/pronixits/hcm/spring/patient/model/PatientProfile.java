package com.pronixits.hcm.spring.patient.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientProfile {

	@Id
	private String patient_id;
	private String username;
	private String phone_no;
	private String address;

	public PatientProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientProfile(String patient_id, String username, String phone_no, String address) {
		super();
		this.patient_id = patient_id;
		this.username = username;
		this.phone_no = phone_no;
		this.address = address;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
