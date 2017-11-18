package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dotridge.domains.Doctor;

public class DoctorDaoImpl implements DoctorDao {

	private static SessionFactory sessionFactoryUtil() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
	
	public Doctor createDoctor(Doctor doc) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(doc);
		tx.commit();

		return doc;
	}

	

	public Doctor getDoctorById(int docId) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		Doctor doc = (Doctor) ses.load(Doctor.class, docId);

		return doc;
	}

	public List<Doctor> getDoctorByName(String docName) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		String hql = "from Doctor d where d.docName like:doctorname";
		Query query = ses.createQuery(hql);
		query.setParameter("doctorname", "%" + docName + "%");
		List<Doctor> list = query.list();
		return list;
	}

	public Doctor updateDoctor(Doctor doc) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.merge(doc);
		tx.commit();

		return doc;
	}

	public boolean deleteDoctor(int docId) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		// Doctor doc = getDoctorById(docId);// if we use load instead of get we
		// ill get exception like "illegally attempted to associate a proxy with
		// two open Sessions"
		Doctor doc = (Doctor) ses.get(Doctor.class, docId);
		Transaction tx = ses.beginTransaction();
		ses.delete(doc);
		tx.commit();

		return true;
	}

	public List<Doctor> getAllDoctors() {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		String hql = "from Doctor doc ";
		Query query = ses.createQuery(hql);
		List<Doctor> list = query.list();
		return list;
	}

	public List<Doctor> getAllDoctorsByPaging(int currentpage, int nfrecordsperpage) {
		SessionFactory sf = sessionFactoryUtil();
		Session ses = sf.openSession();
		String hql = "from Doctor";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage - 1) * nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		List<Doctor> list = query.list();
		return list;
	}

}
