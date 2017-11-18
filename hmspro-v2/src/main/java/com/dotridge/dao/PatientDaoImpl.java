package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.dotridge.domains.Patient;
@Repository
public class PatientDaoImpl implements PatientDao {

	public Patient createPatient(Patient p) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(p);
		tx.commit();
		return p;
	}

	public Patient getPatientById(int pid) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();

		Object o = ses.load(Patient.class, pid);
		Patient p = (Patient) o;
		return p;
	}

	public List<Patient> getPatientByName(String pname) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Patient p where p.pname like:patientname";
		Query query = ses.createQuery(hql);
		query.setParameter("patientname", "%" + pname + "%");
		List<Patient> list = query.list();
		

		return list;
	}

	public Patient updatePatient(Patient p) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
		SessionFactory sf	=cfg.buildSessionFactory();
	Session ses =	sf.openSession();
	
Transaction tx  =ses.beginTransaction();
ses.merge(p);//this method is used instead of update to merge change of one session into other session;


	tx.commit();
	
		return p;
	}

	public boolean deletePatient(int pid) {
		Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
 SessionFactory sf =cfg.buildSessionFactory();
 Session ses = sf.openSession();
//Patient pat= getPatientById(pid);// if we use load instead of get we ill get exception like   "illegally attempted to associate a proxy with two open Sessions"
Patient pat = (Patient)ses.get(Patient.class, pid);
 Transaction tx = ses.beginTransaction();
ses.delete(pat);
tx.commit();
 
 
		return true;
	}

	public List<Patient> getAllPatient() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Patient order by pname desc";
		Query query = ses.createQuery(hql);
		List<Patient> list = query.list();
		return list;
	}

	public List<Patient> getAllPatientByPaging(int currentpage, int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Patient";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage-1)*nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		
		List<Patient> list = query.list();

		
		return list;
	}

}
