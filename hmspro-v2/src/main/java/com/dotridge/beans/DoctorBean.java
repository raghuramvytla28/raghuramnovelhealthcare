package com.dotridge.beans;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;

public class DoctorBean implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2554343080799739768L;
	private int doctorId;
	private String fname;
	private String lname;
	private String email;
	private String mobileNum;
	private String userId;
	private String password;
	private int registerId;
	
  // @Resource
	@Autowired
	private NurseBean nurseBean;
	//private List<PatientBean> patientList;
	
	
/*	public List<PatientBean> getPatientList() {
		return patientList;
	}*/
	/*public void setPatientList(List<PatientBean> patientList) {
		this.patientList = patientList;
	}*/
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public NurseBean getNurseBean() {
		return nurseBean;
	}
	public void setNurseBean(NurseBean nurseBean) {
		this.nurseBean = nurseBean;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRegisterId() {
		return registerId;
	}
	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

}
