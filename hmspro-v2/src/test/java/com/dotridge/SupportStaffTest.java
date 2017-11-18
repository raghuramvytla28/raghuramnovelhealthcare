package com.dotridge;

import java.util.List;

import com.dotridge.dao.SupportStaffDao;
import com.dotridge.dao.SupportStaffDaoImpl;
import com.dotridge.domains.SupportStaff;

public class SupportStaffTest {

	public static void main(String[] args) {
		SupportStaffDao ssd = new SupportStaffDaoImpl();
	/*SupportStaff ss = new SupportStaff();
	ss.setFname("sudheer");
	ss.setLname("kiran");
	ss.setEmail("ravikiran@gmail.com");
	ss.setMobileNum(954216611);
	ss.setUserId("kiran");
	ss.setPassword("kiran123");
	ssd.createStaff(ss);
	System.out.println(ss.getEmail());
*/
		
	/*SupportStaff ss =	ssd.getStaffById(1);
	System.out.println(ss.getFname());*/
		
		/*List<SupportStaff> list = ssd.getStaffByName("ravi");
		for(SupportStaff sf:list){
			System.out.println(sf.getFname()+sf.getLname());*/
		
		
/*//		SupportStaff  ss =  ssd.getStaffById(2);
//		ss.setFname("ravikumar");
//		
//		ss = ssd.updateStaff(ss);
//System.out.println(ss.getFname());		
 
*/	
	
		/*boolean ss = ssd.deleteStaff(6);
		System.out.println(ss);*/
		
		
		
		/*List<SupportStaff> list = ssd.getAllStaff();
		for(SupportStaff ss:list){
			System.out.println(ss.getFname());*/
		List<SupportStaff> list = ssd.getAllStaffByPaging(1, 3);
		for(SupportStaff ss:list){
			System.out.println(ss.getFname());
		
		
		
		}
		
		}
		
	}


