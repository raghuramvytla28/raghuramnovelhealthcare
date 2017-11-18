package com.dotridge;

import com.dotridge.dao.BedTypeDao;
import com.dotridge.dao.BedTypeDaoImpl;
import com.dotridge.domains.BedType;

public class BedTypeDaoTest {

	public static void main(String[] args) {
BedTypeDao btd = new BedTypeDaoImpl();
BedType bt = new BedType();
bt.setBedType("gen");
btd.CreateBedType(bt);
System.out.println(bt.getBedType());




	}

}
