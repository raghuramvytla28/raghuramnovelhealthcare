package com.dotridge.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int patId;
	public String patName;
@OneToMany	
public LabTest labTest;
public int getPatId() {
	return patId;
}
public void setPatId(int patId) {
	this.patId = patId;
}
public String getPatName() {
	return patName;
}
public void setPatName(String patName) {
	this.patName = patName;
}
public LabTest getLabTest() {
	return labTest;
}
public void setLabTest(LabTest labTest) {
	this.labTest = labTest;
}
}
