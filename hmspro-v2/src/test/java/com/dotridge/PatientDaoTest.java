package com.dotridge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dotridge.dao.PatientDao;
import com.dotridge.domains.Patient;

public class PatientDaoTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autodiscovery.xml");
		PatientDao patDao = ctx.getBean(PatientDao.class);
		
		Patient pat = new Patient();
		pat.setPname("Khane");
		
		pat = patDao.createPatient(pat);
		if(pat != null && pat.getPid() >0){
			System.out.println("patient "+pat.getPname()+" saved in db");
		}
	}

}
