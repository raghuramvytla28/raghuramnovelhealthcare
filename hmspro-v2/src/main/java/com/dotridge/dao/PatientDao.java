package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.Patient;

public interface PatientDao {
	public Patient createPatient(Patient p);
	public Patient getPatientById(int pid);
    public List<Patient> getPatientByName(String pname);
    public Patient updatePatient(Patient p);
    public boolean deletePatient(int pid);
    public List<Patient> getAllPatient();
    public List<Patient> getAllPatientByPaging(int currentpage,int nfrecordsperpage);
      }
