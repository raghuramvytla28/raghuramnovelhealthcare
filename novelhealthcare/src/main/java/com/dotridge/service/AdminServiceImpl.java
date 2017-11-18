package com.dotridge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.AdminBean;
import com.dotridge.dao.AdminDao;
import com.dotridge.dao.AdminDaoImpl;
import com.dotridge.dao.HospitalDao;
import com.dotridge.dao.HospitalDaoImpl;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;
@Service
public class AdminServiceImpl implements AdminService {
private HospitalDao hospitalDao= new HospitalDaoImpl();
	
	private AdminDao adminDao= new AdminDaoImpl() ;
	
	public Admin mappingBeanToDomain(AdminBean adminbean) {
	System.out.println("maping method reached");
		Admin admin = new Admin();
		admin.setFirstName(adminbean.getFirstName());
		admin.setMiddleName(adminbean.getMiddleName());
		admin.setLastName(adminbean.getLastName());
		String hospitalName = adminbean.getHospital();
		System.out.println(hospitalName);
		Hospital hospital = hospitalDao.getUniqueHospitalByName(hospitalName);
		System.out.println(hospital);
		// admin.setHospital(hospitalDao.getUniqueHospitalByName(adminbean.getHospital()));

	 admin.setHospital(hospital);

		admin.setEmail(adminbean.getEmail());
		admin.setPassword(adminbean.getPassword());
		admin.setPhone(adminbean.getPhone());
		admin.setProfileDoc(adminbean.getProfileDoc());
		admin.setStatus(admin.getStatus());

		return admin;
	}

	public AdminBean mappingDomainToBean(Admin admin) {
		AdminBean adminbean = new AdminBean();

		adminbean.setAdminId(admin.getAdminId());
		adminbean.setFirstName(admin.getFirstName());
		adminbean.setMiddleName(admin.getMiddleName());
		adminbean.setLastName(admin.getLastName());
		adminbean.setHospital((admin.getHospital()).getHospitalName());
		adminbean.setPhone(admin.getPhone());
		adminbean.setEmail(admin.getEmail());
		adminbean.setPassword(admin.getPassword());
		adminbean.setProfileDoc(admin.getProfileDoc());
		adminbean.setStatus(admin.getStatus());

		return adminbean;
	}

	public AdminBean createAdmin(AdminBean adminBean) {
		System.out.println("service layer reached");
		Admin admin = mappingBeanToDomain(adminBean);
		System.out.println(admin);
		admin = adminDao.createAdmin(admin);
		System.out.println(admin);
		adminBean = mappingDomainToBean(admin);
		System.out.println(adminBean.getAdminId());

		return adminBean;
	}

	public AdminBean updateAdmin(AdminBean adminBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public AdminBean getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AdminBean> getAdminByName(String adminName) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<AdminBean> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AdminBean> getAllAdminByPaging(int currentpage, int nfrecordsperpage) {
		// TODO Auto-generated method stub
		return null;
	}

	

	}
