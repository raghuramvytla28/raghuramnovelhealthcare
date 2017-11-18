package com.dotridge.beans;

import java.io.Serializable;

public class NurseBean implements Serializable {
	private int nId;
	private String nName;
	
	public int getnId() {
		return nId;
	}

	public void setnId(int nId) {
		this.nId = nId;
	}

	public String getnName() {
		return nName;
	}

	public void setnName(String nName) {
		this.nName = nName;
	}

	@Override
	public String toString() {
		return "NurseBean [nId=" + nId + ", nName=" + nName + "]";
	}

}
