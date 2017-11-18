package com.dotridge.dao;

import java.util.List;

import com.dotridge.domains.BedType;

public interface BedTypeDao {
	BedType CreateBedType(BedType bt);
	BedType getBedTypeById (int id);
	BedType getBedTypeByName(String bt);
	List<BedType> getAllBedType ();
	BedType updateBedType(BedType bt);
	List<BedType> getAllBedTypesByPaging();

}
