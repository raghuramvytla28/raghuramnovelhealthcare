package com.dotridge.beans;

import java.io.Serializable;

public class GurdianBean implements Serializable {
	private int gid;
	private String fname;
	private String lname;
	private String email;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
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
	
	@Override
	public String toString() {
		return "GurdianBean [gid=" + gid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobileNum="
				+ mobileNum + "]";
	}
	private long mobileNum;
	
	


	
	
}
