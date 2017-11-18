package com.dotridge;

import java.util.List;

import com.dotridge.dao.LabAssistantDao;
import com.dotridge.dao.LabAssistantDaoImpl;
import com.dotridge.domains.LabAssistant;

public class LabAssistantDaoTest {

	public static void main(String[] args) {
		LabAssistantDao lad = new LabAssistantDaoImpl();

		
		
		/*
		  LabAssistant la = new LabAssistant();
		  la.setFname("sudheer");
		lad.createLabAssistant(la);
		System.out.println(la.getFname());*/
		
		
		/*LabAssistant la = lad.getLabAssistantById(1);
		System.out.println(la.getFname());*/
		
		
List<LabAssistant> labassistent = lad.getLabAssistantByName("sudheer"); 
for(LabAssistant la:labassistent){System.out.println(la.getFname());}

		
	}

}
