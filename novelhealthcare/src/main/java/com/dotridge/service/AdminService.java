package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.AdminBean;
import com.dotridge.domain.Admin;

public interface AdminService {
	public Admin mappingBeanToDomain(AdminBean adminbean);
	public AdminBean mappingDomainToBean(Admin admin);
	
	public	AdminBean createAdmin(AdminBean adminBean);
	public AdminBean updateAdmin(AdminBean adminBean);
	public AdminBean getAdminById(int adminId);
	public List<AdminBean> getAdminByName(String adminName);
	public boolean deleteAdmin(int adminId) ;
	public List<AdminBean> getAllAdmin();
	public List<AdminBean> getAllAdminByPaging(int currentpage ,int nfrecordsperpage);
}
