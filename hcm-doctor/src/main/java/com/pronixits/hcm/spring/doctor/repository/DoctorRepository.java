package com.pronixits.hcm.spring.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pronixits.hcm.spring.doctor.model.DoctorProfile;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorProfile,String> {

}
