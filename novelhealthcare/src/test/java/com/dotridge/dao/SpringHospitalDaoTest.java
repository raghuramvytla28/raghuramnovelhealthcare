package com.dotridge.dao;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.util.Assert;

import com.dotridge.domain.Hospital;

public class SpringHospitalDaoTest {
	HospitalDao hospitalDao=null;
	
	@Before
	public void setup(){
		
		hospitalDao = new HospitalDaoImpl() ;
	}
	@Test
	public void testGetAllHospital(){
	List<Hospital> hospitalList = hospitalDao.getAllHospital();
		org.junit.Assert.assertNotNull(hospitalList);
	}
	@Test
	public void testgetHospitalById(){
		 Hospital hospital  =hospitalDao.getHospitalById(15);
			org.junit.Assert.assertNotNull(hospital);
		
	}

@Test 
public void addHospital(){
	Hospital hospital = new Hospital();
	hospital.setHospitalName("kiran");
	Hospital hospital2 =(Hospital) hospital.clone();
	hospital=hospitalDao.createHospital(hospital);
	
	org.junit.Assert.assertNotEquals(hospital, hospital2);
}
	@After
	public void tearDown(){
		hospitalDao = null;
	}

}
