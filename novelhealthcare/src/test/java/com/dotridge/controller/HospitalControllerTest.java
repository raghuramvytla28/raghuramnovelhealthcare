package com.dotridge.controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import com.mysql.jdbc.Driver;

import junit.framework.Assert;
@Ignore
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:novelhealth-servlet.xml","classpath:applicationContext.xml"})
public class HospitalControllerTest {

	
	@Autowired
	HospitalContainer hospitalController;
Model model= null;
	@Before
	public void setUp() {
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		//dmd.getConnection();
model = new BindingAwareModelMap();
	}

	@Test
	public void testGetAllHospitals() {
		String viewName =hospitalController.viewAllHospitals(model);
org.junit.Assert.assertNotNull(viewName);
	}

}
