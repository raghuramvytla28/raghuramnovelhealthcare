package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.SupportStaff;

public interface SupportStaffDao {
public SupportStaff createStaff(SupportStaff staff);
public	SupportStaff getStaffById (int sId);
public List<SupportStaff> getStaffByName(String sName);
public SupportStaff updateStaff(SupportStaff staff);
public boolean deleteStaff(int sId);
public List<SupportStaff> getAllStaff();
public List<SupportStaff> getAllStaffByPaging(int currentpage,int nfrecordsperpage);
	

}
