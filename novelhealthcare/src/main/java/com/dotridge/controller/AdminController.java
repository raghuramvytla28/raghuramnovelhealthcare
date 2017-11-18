package com.dotridge.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.bean.AdminBean;
import com.dotridge.bean.HospitalBean;
import com.dotridge.domain.Admin;
import com.dotridge.service.AdminService;
import com.dotridge.service.AdminServiceImpl;
import com.dotridge.service.HospitalService;

@Controller
@RequestMapping("/adminMgmt")
public class AdminController {
	@Autowired
	private HospitalService hospitalService;
	
	@Autowired
	private AdminService adminService;
	
		
			

	@RequestMapping(value = "/getAllAdmins")
	public String viewAllAdmins(Model model) {
	
		return "getAdminBoard";
	}

	@RequestMapping(value = "/getAdminRegForm")
	public String getHospitalRegistraionForm(Model model) {

		List<HospitalBean> list = hospitalService.getAllHospital();
		System.out.println(list.size());
		List<String> hospNameList = new ArrayList<String>();
		for (HospitalBean hospital : list) {
			System.out.println("rendering admin add page");

			hospNameList.add(hospital.getHospitalName());
		}
		System.out.println(hospNameList.size());

		model.addAttribute("adminBean", new AdminBean());
		model.addAttribute("hospNameList", hospNameList);

		return "adminRegForm";
	}

	@RequestMapping(value = "/addAdmin" ,method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute("adminBean") AdminBean adminBean) {
		
		System.out.println("admin Bean"+adminBean.toString());
	adminBean	=adminService.createAdmin(adminBean);

		System.out.println("given bean to controller"+adminBean.getAdminId());
		return "";
	}
}
