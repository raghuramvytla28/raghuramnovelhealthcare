package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;

public class AdminDaoImpl implements AdminDao {

	public Admin createAdmin(Admin admin) {
		System.out.println("admin dao reached");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
	Transaction tx = ses.beginTransaction();
	ses.save(admin);
	tx.commit();
	
		return admin;
	}

	public Admin updateAdmin(Admin admin) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
	Transaction tx = ses.beginTransaction();
	ses.merge(admin);
	tx.commit();
		return admin;
	}

	public Admin getAdminById(int adminId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
Admin admin =	(Admin)ses.load(Admin.class, adminId);
		
		
		return admin;
	}

	public List<Admin> getAdminByName(String adminName) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
	String hql = "from Admin ad where ad.firstName like:adminname";
	Query query =ses.createQuery(hql);
	query.setParameter("adminname", "%"+adminName +"%");
	List<Admin> list = query.list();
		// TODO Auto-generated method stub
		return list;
	}

	public boolean deleteAdmin(int adminId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
	Admin admin = (Admin)ses.get(Admin.class, adminId);
	System.out.println(admin.getAdminId());
Transaction tx = ses.beginTransaction();	
	ses.delete(admin);
		tx.commit();
		return false;
	}

	public List<Admin> getAllAdmin() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();
	String hql = "from Admin ad";
	Query query = ses.createQuery(hql);
	List<Admin> list = query.list();
		return list;
	}

	public List<Admin> getAllAdminByPaging(int currentpage, int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Admin";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage-1)*nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		List <Admin> list = query.list();	
		return list;
	}

}
