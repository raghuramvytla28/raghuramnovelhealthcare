package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.LabAssistant;

public class LabAssistantDaoImpl implements LabAssistantDao {

	public LabAssistant createLabAssistant(LabAssistant la) {
		Configuration cfg =new  Configuration ();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(la);
		tx.commit();
		
		
		return la;
	}

	public LabAssistant getLabAssistantById(int lId) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses = sf.openSession();
LabAssistant la =	(LabAssistant)ses.load(LabAssistant.class, lId);
		return la;
	}

	public List<LabAssistant> getLabAssistantByName(String fName) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from LabAssistant la where la.fname like:labassistant";
		Query query = ses.createQuery(hql);
		query.setParameter("labassistant", "%"+fName+"%");
		List<LabAssistant> labassistant = query.list();
		
		return labassistant;
	}

	public LabAssistant updateLabAssistant(LabAssistant la) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses = sf.openSession();
	Transaction tx =	ses.beginTransaction();
	ses.merge(la);
	tx.commit();
		
		return la;
	}

	public boolean deleteLabAssistant(int lId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses = sf.openSession();
		LabAssistant la = getLabAssistantById(lId);
Transaction tx =	ses.beginTransaction();
ses.delete(la);

		return false;
	}

	public List<LabAssistant> getAllLabAssistant() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql ="from LabAssistant la";
	Query query = ses.createQuery(hql);
	List<LabAssistant> list = query.list();
		
		return list;
	}

	public List<LabAssistant> getAllLabAssistantByPaging(int currentpage,int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from LabAssistant la";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage - 1) * nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		List<LabAssistant> list = query.list();
		return list;
	}

	
	}


