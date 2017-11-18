package novelhealthcare;

import com.dotridge.bean.AdminBean;
import com.dotridge.bean.HospitalBean;
import com.dotridge.dao.AdminDao;
import com.dotridge.dao.AdminDaoImpl;
import com.dotridge.dao.HospitalDao;
import com.dotridge.dao.HospitalDaoImpl;
import com.dotridge.domain.Admin;
import com.dotridge.domain.Hospital;
import com.dotridge.service.AdminService;
import com.dotridge.service.AdminServiceImpl;

public class AdminDaoTest {

	public static void main(String[] args) {
	//AdminService as=new  AdminServiceImpl();
		AdminDao ad = new AdminDaoImpl();
		Admin admin = new Admin();
		
	HospitalDao hd = new HospitalDaoImpl();
	Hospital hospital =	hd.getUniqueHospitalByName("yashodha");
	System.out.println(hospital);
	admin.setHospital(hospital);
//	System.out.println(hospital);
//Hospital hospital=		hd.getHospitalById(1);
//AdminBean ab = new AdminBean();
	admin	=ad.createAdmin(admin);
	System.out.println(admin);
		
		
//	ad =	as.createAdmin(ab);
//	System.out.println(ab.getAdminId());
	//	admin.setFirstName("raghuram chowdary");
	//	admin.setHospital(hospital);
//	admin	= ad.createAdmin(admin);
	
	//System.out.println(admin.getFirstName()+","+admin.getHospital());
		

	/*admin = ad.getAdminById(1);
	System.out.println(admin.getAdminId());*/
		
		
	/*List<Admin>	list = ad.getAdminByName("raghuram");
		for(Admin a:list){
			System.out.println(a.getFirstName());
			
		}*/
		
		
		/*List<Admin> list = ad.getAllAdmin();
		for(Admin a:list){
			System.out.println(a.getFirstName());
		}*/
		/*List<Admin> list = ad.getAllAdminByPaging(1, 1);
		for(Admin a:list){
			System.out.println(a.getFirstName());
		}*/
		
		/*boolean bl = ad.deleteAdmin(3);
		System.out.println(bl);*/
	}

}
