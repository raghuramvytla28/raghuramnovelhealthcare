package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Hospital;

public interface HospitalDao {
	public	Hospital createHospital(Hospital hospital);
	public	Hospital updateHospital(Hospital hospital);
	public  Hospital getHospitalById(int hopitalId);
	public	List<Hospital> getHospitalByName(String hospitalName);
	public boolean deleteHospital(int HospitalId);
	public List<Hospital>  getAllHospital();
	public List<Hospital> getAllHospitalByPagination(int currentpage,int nfrecordsperpage);
	public List<Hospital> getHospitalByEmail(String email);
	public List<Hospital> getHospitalByAddress1(String address1);
	public List<Hospital> getHospitalByPhoneNo(long phoneno);
	public List<Hospital> getHospitalByStatus(String status);
	public Hospital getUniqueHospitalByName(String hospitalName);



}
