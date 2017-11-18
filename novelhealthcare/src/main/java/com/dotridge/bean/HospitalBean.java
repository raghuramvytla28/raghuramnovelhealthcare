package com.dotridge.bean;

import java.io.Serializable;

public class HospitalBean implements Serializable {
	private int hospitalId;
	private String hospitalName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;
	private long phoneno;
	private String email;
	private String fax;
	private String logo;
	private String status;
	private String registrationDoc;

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getRegistrationDoc() {
		return registrationDoc;
	}

	public void setRegistrationDoc(String registrationDoc) {
		this.registrationDoc = registrationDoc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HospitalBean [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", phoneno=" + phoneno + ", email=" + email + ", fax=" + fax + ", logo=" + logo + ", registrationDoc="
				+ registrationDoc + ", status=" + status + "]";
	}

}
