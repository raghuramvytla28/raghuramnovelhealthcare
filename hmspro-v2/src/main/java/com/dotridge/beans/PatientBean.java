package com.dotridge.beans;

import java.io.Serializable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PatientBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4095326796573910336L;
	
	private int pid;
	private String fname;
	private String lname;
	private String email;
	private long mobileNum;
	private String userId;
	private String password;
	private int age;
	private String gender;
private Set<String> deasesList;
private Map<String,String> medicines;
private Properties reports;
private GurdianBean gurdianBean;

/*public PatientBean(int pid,
String fname,
String lname,
String email, 
long mobileNum,
String userId,
String password,
int age,
String gender,
Set<String> deasesList,
Map<String,String> medicines,
GurdianBean gurdianBean
){
	this.pid=pid;
	this.fname=fname;
	this.lname=lname;
	this.email=email;
	this.mobileNum=mobileNum;
	this.userId=userId;
	this.password=password;
	this.age=age;
    this.deasesList= deasesList;
    this.medicines=medicines;
    this.gurdianBean= gurdianBean;
}
*/
public GurdianBean getGurdianBean() {
	return gurdianBean;
}
public void setGurdianBean(GurdianBean gurdianBean) {
this.gurdianBean = gurdianBean;
}

	

	public Properties getReports() {
	return reports;
}
public void setReports(Properties reports) {
	this.reports = reports;
}
	public Map<String, String> getMedicines() {
	return medicines;
}
public void setMedicines(Map<String, String> medicines) {
	this.medicines = medicines;
}
	public Set<String> getDeasesList() {
	return deasesList;
}
public void setDeasesList(Set<String> deasesList) {
	this.deasesList = deasesList;

	
	}
	int getPid() {
		return pid;
	}
	public void setPid(int pid) {
	this.pid = pid;
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
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PatientBean [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobileNum="
				+ mobileNum + ", userId=" + userId + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", deasesList=" + deasesList + ", medicines=" + medicines + ", reports=" + reports + ", gurdianBean="
				+ gurdianBean + "]";
	}
	

}
