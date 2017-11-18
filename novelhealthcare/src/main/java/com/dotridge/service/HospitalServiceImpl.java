package com.dotridge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.HospitalBean;
import com.dotridge.dao.HospitalDao;
import com.dotridge.domain.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalDao hospitalDao;

	public Hospital mappingBeanToDomain(HospitalBean hospitalbean) {

		Hospital hospital = new Hospital();
		hospital.setHospitalId(hospitalbean.getHospitalId());
		hospital.setHospitalName(hospitalbean.getHospitalName());
		hospital.setAddress1(hospitalbean.getAddress1());
		hospital.setAddress2(hospitalbean.getAddress2());
		hospital.setCity(hospitalbean.getCity());
		hospital.setState(hospitalbean.getState());
		hospital.setZipcode(hospitalbean.getZipcode());
		hospital.setPhoneno(hospitalbean.getPhoneno());
		hospital.setEmail(hospitalbean.getEmail());
		hospital.setFax(hospitalbean.getFax());
		hospital.setLogo(hospitalbean.getLogo());
		hospital.setRegistrationDoc(hospitalbean.getRegistrationDoc());
		hospital.setStatus(hospitalbean.getStatus());

		return hospital;
	}

	public HospitalBean mappingDomainToBean(Hospital hospital) {

		HospitalBean hospitalbean = new HospitalBean();
		hospitalbean.setHospitalId(hospital.getHospitalId());
		hospitalbean.setHospitalName(hospital.getHospitalName());
		hospitalbean.setAddress1(hospital.getAddress1());
		hospitalbean.setAddress2(hospital.getAddress2());
		hospitalbean.setCity(hospital.getCity());
		hospitalbean.setState(hospital.getState());
		hospitalbean.setZipcode(hospital.getZipcode());
		hospitalbean.setPhoneno(hospital.getPhoneno());
		hospitalbean.setEmail(hospital.getEmail());
		hospitalbean.setFax(hospital.getFax());
		hospitalbean.setLogo(hospital.getLogo());
		hospitalbean.setRegistrationDoc(hospital.getRegistrationDoc());
		hospitalbean.setStatus(hospital.getStatus());
		// TODO Auto-generated method stub
		return hospitalbean;
	}

	public HospitalBean createHospital(HospitalBean hospitalBean) {
		Hospital hospital = mappingBeanToDomain(hospitalBean);

		hospital = hospitalDao.createHospital(hospital);
		hospitalBean = mappingDomainToBean(hospital);
		return hospitalBean;
	}

	public HospitalBean updateHospital(HospitalBean hospitalBean) {
		Hospital hospital = mappingBeanToDomain(hospitalBean);
		System.out.println(hospital.getHospitalId() + "this is id of domain in service");
		hospital = hospitalDao.updateHospital(hospital);
		hospitalBean = mappingDomainToBean(hospital);
		return hospitalBean;
	}

	public HospitalBean getHospitalById(int hopitalId) {
		Hospital hospital = hospitalDao.getHospitalById(hopitalId);
		HospitalBean hospitalBean = mappingDomainToBean(hospital);
		return hospitalBean;
	}

	public List<HospitalBean> getHospitalByName(String hospitalName) {
		List<Hospital> list = hospitalDao.getHospitalByName(hospitalName);
		System.out.println(list.size());
		List<HospitalBean> uiList = null;
		System.out.println("entered in to servicelayer1");
		if (list != null && !list.isEmpty()) {

			uiList = new ArrayList<HospitalBean>();
			for (Hospital hospital : list) {
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);

			}
		}
		return uiList;
	}

	public boolean deleteHospital(int HospitalId) {
		boolean b = hospitalDao.deleteHospital(HospitalId);
		return false;
	}

	public List<HospitalBean> getAllHospital() {
		List<Hospital> list = hospitalDao.getAllHospital();
		List<HospitalBean> uiList = null;
		if (list != null && !list.isEmpty()) {

			uiList = new ArrayList<HospitalBean>();
			for (Hospital hospital : list) {
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);

			}
		}
		return uiList;
	}

	public List<HospitalBean> getAllHospitalByPagination(int currentpage, int nfrecordsp) {
	List<Hospital> list=	hospitalDao.getAllHospitalByPagination(currentpage, nfrecordsp);
	System.out.println("entered into service layer");
	List<HospitalBean> uiList = null;
	if (list != null && !list.isEmpty()) {

		uiList = new ArrayList<HospitalBean>();
		for (Hospital hospital : list) {
			HospitalBean hospitalBean = mappingDomainToBean(hospital);
			uiList.add(hospitalBean);
		}
	}
		return uiList;
	}

	public List<HospitalBean> getHospitalByEmail(String email) {
		List<Hospital> list = hospitalDao.getHospitalByEmail(email);
		System.out.println("entered into service layer");
		List<HospitalBean> uiList = null;
		if (list != null && !list.isEmpty()) {

			uiList = new ArrayList<HospitalBean>();
			for (Hospital hospital : list) {
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);
			}
		}
		return uiList;
	}

	public List<HospitalBean> getHospitalByAddress1(String address1) {
		System.out.println(address1 + "string in service layer");
		List<Hospital> list = hospitalDao.getHospitalByAddress1(address1);
		System.out.println(list.size() + "this is size in service layer");
		List<HospitalBean> uiList = null;
		if (list != null && !list.isEmpty()) {
			uiList = new ArrayList<HospitalBean>();
			for (Hospital hospital : list) {
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);
			}
		}
		return uiList;
	}

	public List<HospitalBean> getHospitalByPhoneNo(long phoneno) {
		List<Hospital> list = hospitalDao.getHospitalByPhoneNo(phoneno);
		System.out.println(list.size());
		List<HospitalBean> uiList = null;
		if (list != null && !list.isEmpty()) {
			uiList = new ArrayList<HospitalBean>();
			for (Hospital hospital : list) {
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);
			}
		}

		return uiList;
	}

	public List<HospitalBean> getHospitalByStatus(String status) {
		List<Hospital> list = hospitalDao.getHospitalByStatus(status);
		System.out.println(list.size() + "size in service");

		if (list != null && !list.isEmpty()) {
			for (Hospital hospital : list) {
				List<HospitalBean> uiList = new ArrayList<HospitalBean>();
				HospitalBean hospitalBean = mappingDomainToBean(hospital);
				uiList.add(hospitalBean);
				return uiList;
			}
		}
		return null;
	}

}
