package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Admin;

public interface AdminDao {
public	Admin createAdmin(Admin admin);
public Admin updateAdmin(Admin admin);
public Admin getAdminById(int adminId);
public List<Admin> getAdminByName(String adminName);
public boolean deleteAdmin(int adminId) ;
public List<Admin> getAllAdmin();
public List<Admin> getAllAdminByPaging(int currentpage ,int nfrecordsperpage);
}
