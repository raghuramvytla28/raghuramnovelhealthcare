package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.Doctor;

public interface DoctorDao {
public	Doctor createDoctor(Doctor doc);
public Doctor getDoctorById(int docId);
public List<Doctor> getDoctorByName(String docName);
public Doctor updateDoctor(Doctor doc) ;
public boolean deleteDoctor (int docId);	
public List<Doctor> getAllDoctors();
public List<Doctor> getAllDoctorsByPaging(int currentpage,int nfrecordsperpage);	



}
