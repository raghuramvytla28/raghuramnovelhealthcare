package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.Nurse;

public interface NurseDao {
	public Nurse createNurse(Nurse nurse);
	public Nurse getNurseById(int nId);
	public List<Nurse> getNurseByName(String nName);
	 public Nurse updateNurse(Nurse nurse);
	 public boolean deleteNurse(int nId);
	 public List<Nurse> getAllNurse();
	 public List<Nurse> getAllNurseByPaging(int currentpage, int nfrecordsperpag);
	 
	 

}
