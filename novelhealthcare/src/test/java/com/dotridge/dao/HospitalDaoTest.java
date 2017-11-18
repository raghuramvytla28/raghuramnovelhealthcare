package com.dotridge.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dotridge.domain.Hospital;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationcontext.xml")
public class HospitalDaoTest {
	@Autowired
	HospitalDao hospitalDao;
	@Before
	public void setup(){
		/*@Autowired
		hospitalDao;*/
		//HospitalDao	hospitalDao = new HospitalDaoImpl() ;
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
	

}
