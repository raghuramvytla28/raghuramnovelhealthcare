package com.dotridge;

import com.dotridge.dao.NurseDao;
import com.dotridge.dao.NurseDaoImpl;
import com.dotridge.domains.Nurse;

public class NureseDaoTest {

	public static void main(String[] args) {
		NurseDao nd = new NurseDaoImpl();
		
		
		Nurse nurse = new Nurse();
		nurse.setnId(1);
		nurse.setnName("geetha");
		nd.createNurse(nurse);
		System.out.println(nurse.getnId()+" "+nurse.getnName());
		
		
		
		

	}

}
