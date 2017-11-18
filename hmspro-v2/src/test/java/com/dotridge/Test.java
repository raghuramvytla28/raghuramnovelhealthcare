package com.dotridge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.Doctor;

public class Test {

	public static void main(String[] args) {
		System.out.println("entered into main class");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf	=cfg.buildSessionFactory();
Session ses	=sf.openSession();
Transaction tx =ses.beginTransaction();

Doctor doctor = new Doctor();
doctor.setDocId(1);
doctor.setDocName("srinivas");
ses.save(doctor);
 tx.commit();
				

	}

}
