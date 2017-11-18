package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.Hospital;
@Repository
public class HospitalDaoImpl implements HospitalDao {

	public Hospital createHospital(Hospital hospital) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(hospital);
		tx.commit();
		
		return hospital;
	}

	public Hospital updateHospital(Hospital hospital) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		ses.merge(hospital);
		tx.commit();
		return hospital;
	}

	public Hospital getHospitalById(int hopitalId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
	Hospital hospital =(Hospital)ses.load(Hospital.class,hopitalId);
		return hospital;
	}

	public List<Hospital> getHospitalByName(String hospitalName) {
		System.out.println("entered in to dao layer 2");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
		String hql = "from Hospital hs where hs.hospitalName like:hospital";
	Query query = ses.createQuery(hql);
	query.setParameter("hospital", "%"+hospitalName+"%");
	List<Hospital> list = query.list();
		return list;
	}

	public boolean deleteHospital(int HospitalId) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Hospital hospital = (Hospital)ses.get(Hospital.class,HospitalId );
		Transaction tx = ses.beginTransaction();
       ses.delete(hospital);
       System.out.println(hospital.getHospitalId());
		tx.commit();
		ses.close();
		sf.close();
		System.out.println(hospital.getHospitalId());
		System.out.println(hospital.getHospitalName());
		if(hospital == null)
		{ return true;}
		else
		{return false;}
	}

	public List<Hospital> getAllHospital() {Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session ses = sf.openSession();	
	String hql = "from Hospital hs";
   Query query = ses.createQuery(hql);
   List<Hospital> list = query.list();
		
		return list;
	}

	public List<Hospital> getAllHospitalByPagination(int currentpage,int nfrecordsperpage) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		String hql = "from Hospital";
		Query query = ses.createQuery(hql);
		query.setFirstResult((currentpage-1)*nfrecordsperpage);
		query.setMaxResults(nfrecordsperpage);
		List <Hospital> list = query.list();	
		// TODO Auto-generated method stub
		return list;
	}

	public List<Hospital> getHospitalByEmail(String email) {
		System.out.println("entered in to dao layer 2");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
		String hql = "from Hospital hs where hs.email like:Email";
	Query query = ses.createQuery(hql);
	query.setParameter("Email", "%"+email+"%");
	List<Hospital> list = query.list();
		return list;
	}

	public List<Hospital> getHospitalByAddress1(String address1) {
		System.out.println(address1+"string in dao layer");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
		String hql = "from Hospital hs where hs.address1 like:Address1";
	Query query = ses.createQuery(hql);
	query.setParameter("Address1", "%"+address1+"%");
	List<Hospital> list = query.list();
	System.out.println(list.size()+"size in dao");
		return list;
		
	}

	public List<Hospital> getHospitalByPhoneNo(long phoneno) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
		String hql = "from Hospital hs where hs.phoneno = :Phoneno";
	Query query = ses.createQuery(hql);
	query.setParameter("Phoneno", phoneno);
	List<Hospital> list = query.list();
	return list;
	}

	public List<Hospital> getHospitalByStatus(String status) {
		System.out.println();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();	
		String hql = "from Hospital hs where hs.status like:Status";
	Query query = ses.createQuery(hql);
	query.setParameter("Status", "%"+status+"%");
	List<Hospital> list = query.list();
	System.out.println(list.size()+"size in dao");
	return list;
	}
//to get unique reocrd from data base not like the search
	public Hospital getUniqueHospitalByName(String hospitalName)
	{
		System.out.println("hospital dao reached");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session	session=sf.openSession();
		String hql ="from Hospital hs where hs.hospitalName=:hospital";
		Query query =session.createQuery(hql);
		query.setParameter("hospital", hospitalName);
		Hospital hospital = (Hospital)query.uniqueResult();
		return hospital;
	}
}
