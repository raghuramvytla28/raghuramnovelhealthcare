package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.HospitalBean;
import com.dotridge.domain.Hospital;

public interface HospitalService {
	public Hospital mappingBeanToDomain(HospitalBean hospitalBean);
	public HospitalBean mappingDomainToBean(Hospital hospital);
	
	public	HospitalBean createHospital(HospitalBean hospitalBean);
	public HospitalBean updateHospital(HospitalBean hospitalBean);
	public	HospitalBean getHospitalById(int hopitalId);
	public	List<HospitalBean> getHospitalByName(String hospitalName);
	public	boolean deleteHospital(int HospitalId);
	public	List<HospitalBean>  getAllHospital();
    public List<HospitalBean> getAllHospitalByPagination(int currentpage,int nfrecordsp);
	public List<HospitalBean> getHospitalByEmail(String email);
	public List<HospitalBean> getHospitalByAddress1(String address1);
	public List<HospitalBean> getHospitalByPhoneNo(long phoneno);
	public List<HospitalBean> getHospitalByStatus(String status);

}
