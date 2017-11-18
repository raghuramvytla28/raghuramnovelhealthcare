package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.SupportStaff;

public class SupportStaffDaoImpl implements SupportStaffDao {

	public SupportStaff createStaff(SupportStaff staff) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(staff);
		tx.commit();
		return null;
	}

	public SupportStaff getStaffById(int sId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();

		SupportStaff suf = (SupportStaff) ses.load(SupportStaff.class, sId);

		return suf;
	}

	public List<SupportStaff> getStaffByName(String sName) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from SupportStaff ss where ss.fname like:staffname";

		Query query = ses.createQuery(hql);
		query.setParameter("staffname", "%" + sName + "%");
		List<SupportStaff> ss = query.list();

		return ss;
	}

	public SupportStaff updateStaff(SupportStaff staff) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.merge(staff);
		tx.commit();

		return staff;
	}

	public boolean deleteStaff(int sId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		SupportStaff ss = (SupportStaff) ses.get(SupportStaff.class, sId);
		ses.beginTransaction();
		ses.delete(ss);

		return true;
	}

	public List<SupportStaff> getAllStaff() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from SupportStaff order by fname desc";
		Query query = ses.createQuery(hql);
		List<SupportStaff> ss = query.list();

		return ss;
	}

	public List<SupportStaff> getAllStaffByPaging(int currentpage, int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from SupportStaff ss";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage - 1) * nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		List<SupportStaff> ss = query.list();

		return ss;
	}

}
