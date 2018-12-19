package com.pronixits.hcm.spring.doctor.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorProfile {
	
	@Id
	private String doctor_id;
	private String doctor_name;
	private int experience;
	private String specialization;
	private String working_hours;
	
	public DoctorProfile() {
		super();
	}
	
	public DoctorProfile(String doctor_id, String doctor_name, int experience, String specialization,
			String working_hours) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.experience = experience;
		this.specialization = specialization;
		this.working_hours = working_hours;
	}
	
	public String getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(String doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(String working_hours) {
		this.working_hours = working_hours;
	}	
}
