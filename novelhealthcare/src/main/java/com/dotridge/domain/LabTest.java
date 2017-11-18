package com.dotridge.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LabTest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int testId;
	public String testName;
	@ManyToOne
	public Patient patient;

}
