package novelhealthcare;
import com.dotridge.dao.HospitalDao;
import com.dotridge.dao.HospitalDaoImpl;
import com.dotridge.domain.Hospital;

public class HospitalDaoTest {

	public static void main(String[] args) {
	Hospital hospital = new Hospital();
		HospitalDao hd = new HospitalDaoImpl();
		
		
	
	/*System.out.println(hospital.getHospitalName());
	System.out.println(hospital.getHospitalId());*/
		
		
		/*hospital = hd.getHospitalById(21);
		System.out.println(hospital.getHospitalId());
	hospital.setEmail("image@gmail.com");
		hospital = hd.updateHospital(hospital);
System.out.println(hospital.getHospitalId());*/
	/*
		List<Hospital> hospitals = hd.getHospitalByName("agarwals");
		for(Hospital hs:hospitals){
			System.out.println(hs.getHospitalName());
		}*/
		

		
	/*	List<Hospital> list = hd.getAllHospitalByPagination(1, 3);
		for(Hospital hs:list){
			System.out.println(hs.getHospitalName());}*/
	/*boolean bl =	hd.deleteHospital(24);
	System.out.println(bl);*/
	
	/*HospitalService hs = new HospitalServiceImpl();
		hs.getAllHospital();*/
		
	/*List<Hospital> list	= hd.getHospitalByAddress1("kakinada");
	System.out.println(list.size());
	
	for(Hospital hosp:list)	{
		System.out.println(hosp.getAddress1());
	}*/
	
		/*List<Hospital> list	= hd.getHospitalByStatus("active");
		System.out.println(list.size());
		
		for(Hospital hosp:list)	{
			System.out.println(hosp.getStatus());}*/
	
		/*
		List<Hospital> list	= hd.getHospitalByEmail("raghuramvytla@gmail.com");
		System.out.println(list.size());
		
		for(Hospital hosp:list)	{
			System.out.println(hosp.getEmail());
		
		}*/
	
	/*List<Hospital>list = hd.getHospitalByPhoneNo(9542166111L);
	System.out.println(list.size());
	for(Hospital hosp:list)	{
		System.out.println(hosp.getPhoneno());
	
	}*/
		
	Hospital hosp= hd.getUniqueHospitalByName("agarwals");
	System.out.println(hosp.toString());
	System.out.println(hosp.getHospitalName());
	}
}
