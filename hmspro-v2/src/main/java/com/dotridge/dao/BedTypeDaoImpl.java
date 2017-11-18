package com.dotridge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.BedType;

public class BedTypeDaoImpl implements BedTypeDao {

	public BedType CreateBedType(BedType bt) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(bt);
		tx.commit();

		return bt;
	}

	public BedType getBedTypeById(int id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		BedType bt = (BedType) ses.load(BedType.class, id);
		return bt;
	}

	public BedType getBedTypeByName(String bt) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from BedType bt where";

		return null;
	};

	public List<BedType> getAllBedType() {
		// TODO Auto-generated method stub
		return null;
	}

	public BedType updateBedType(BedType bt) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BedType> getAllBedTypesByPaging() {
		// TODO Auto-generated method stub
		return null;
	}

}
