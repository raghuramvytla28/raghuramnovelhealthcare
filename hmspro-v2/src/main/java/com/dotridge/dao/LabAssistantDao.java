package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.LabAssistant;

public interface LabAssistantDao {
	public LabAssistant createLabAssistant(LabAssistant la);
	public LabAssistant getLabAssistantById(int lId);
	public List<LabAssistant> getLabAssistantByName(String lName);
	public LabAssistant updateLabAssistant(LabAssistant la);
	public boolean deleteLabAssistant(int lId);
	public  List<LabAssistant> getAllLabAssistant();
	public List<LabAssistant> getAllLabAssistantByPaging(int currentpage,int nfrecordsperpage);
	

}
