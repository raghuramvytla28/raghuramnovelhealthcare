package com.dotridge;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dotridge.beans.DoctorBean;

public class ApplicationBeanTest {

	public static void main(String[] args) {
		/*Resource parentResource = new ClassPathResource("parent-beans.xml");// one of the two implimentaion class
		BeanFactory parentContainer = new XmlBeanFactory(parentResource);//reading from resource interface
		GurdianBean gb= (GurdianBean)parentContainer.getBean(GurdianBean.class);
		System.out.println(gb.getFname());*/
		
	/*	Resource res = new ClassPathResource("appilcation-beans.xml");// one of the two implimentaion class
		BeanFactory container = new XmlBeanFactory(res);
		PatientBean patient=(PatientBean)container.getBean(PatientBean.class);
		System.out.println(patient.getEmail());
		System.out.println(patient.getDeasesList());
		System.out.println(patient.getMedicines());
		System.out.println(patient.getReports());
		System.out.println(patient.getGurdianBean());*/
		
		


	/*Resource rsc= new ClassPathResource("doctor-bean.xml");
	BeanFactory beanfactory = new XmlBeanFactory(rsc);
	DoctorBean doctor = (DoctorBean)beanfactory.getBean(DoctorBean.class);
	System.out.println(doctor.getDoctorId());
	System.out.println(doctor.getNurseBean());
	 System.out.println(doctor.getPatientList());*/
		
		
		/*
		Resource rsc= new ClassPathResource("circulardependency-problem.xml");
		BeanFactory beanfactory = new XmlBeanFactory(rsc);
		A patient = (A)beanfactory.getBean(A.class);
		System.out.println(patient);
		System.out.println(patient.getB());
		A patient2 = (A)beanfactory.getBean(A.class);
		System.out.println(patient2);
		System.out.println(patient2.getB());
		
		BeanFactory beanfactory2 = new XmlBeanFactory(rsc);
		A patient3 = (A)beanfactory2.getBean(A.class);
		System.out.println(patient3);
		System.out.println(patient3.getB());
		//System.out.println(patient.getMedicines());
		//System.out.println(patient.getGurdianBean());
		 * 
*/	
		
	/*ApplicationContext	 rsc= (ApplicationContext) new ClassPathResource("springbeans-autowiring.xml");
		BeanFactory beanfactory = new XmlBeanFactory(rsc);*/
	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans-autowiring.xml");
		DoctorBean doctor = (DoctorBean)context.getBean("DoctorBean");
System.out.println(doctor.getFname());
		System.out.println(doctor.getNurseBean());
	
	}
        
	


}
