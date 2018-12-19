package com.pronixits.hcm.spring.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pronixits.hcm.spring.patient.model.PatientProfile;

@Repository
public interface PatientRepository extends JpaRepository<PatientProfile, String>{

}
