package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.Nurse;

public class NurseDaoImpl implements NurseDao {

	public Nurse createNurse(Nurse nurse) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
  SessionFactory sf =	cfg.buildSessionFactory();
	Session ses = sf.openSession();
Transaction tx	= ses.beginTransaction();
	ses.save(nurse);
	tx.commit();
	
		
		
		return nurse;
	}

	public Nurse getNurseById(int nId) {
		
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
	  SessionFactory sf =	cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Nurse nurse = (Nurse)ses.load(Nurse.class,nId) ;
		return nurse;
	}

	public List<Nurse> getNurseByName(String nName) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
  SessionFactory sf =	cfg.buildSessionFactory();
	Session ses = sf.openSession();
	String hql ="from Nurse n where n.fname like:nurse";
	Query query = ses.createQuery(hql);
	query.setParameter("nurse", nName);
	List<Nurse> nurse = query.list();
		
		return nurse;
	}

	public Nurse updateNurse(Nurse nurse) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
  SessionFactory sf =	cfg.buildSessionFactory();
	Session ses = sf.openSession();
Transaction tx	= ses.beginTransaction();
ses.merge(nurse);
tx.commit();
		return nurse;
	}

	public boolean deleteNurse(int nId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
  SessionFactory sf =	cfg.buildSessionFactory();
	Session ses = sf.openSession();
	Nurse nurse =(Nurse)ses.get("Nurse.class",nId);
	
		return false;
	}

	public List<Nurse> getAllNurse() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
  SessionFactory sf =	cfg.buildSessionFactory();
	Session ses = sf.openSession();
	String  hql ="from Nurse order by desc";
	Query query = ses.createQuery(hql);
	List<Nurse> nurse = query.list();
	
		
		return nurse;
	}

	public List<Nurse> getAllNurseByPaging(int currentpage, int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Nurse";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage-1)*nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		
		List<Nurse> list = query.list();

		
		return list;
	}

}
