package com.dotridge.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.bean.HospitalBean;
import com.dotridge.service.HospitalService;
import com.dotridge.util.ServiceConstants;

@Controller
@RequestMapping("/hospitalMgmt")
public class HospitalContainer {
	@Autowired
	private HospitalService hospitalService;

	@RequestMapping(value = "/getAllHospital")
	public String viewAllHospitals(Model model) {

		try {
			List<HospitalBean> list = hospitalService.getAllHospital();
			model.addAttribute("uiHospList", list);
			System.out.println(list.size());
			int listSize = list.size();
			int pageBarSize = Math.round((listSize/ServiceConstants.NUM_REC_PER_PAGE)+1) ;
			List<Integer> pageBarList = new ArrayList(); 
			for(int i=0;i<pageBarSize; i++){
				pageBarList.add(i);
				System.out.println(i);
			}
			model.addAttribute("pageBarList",pageBarList);
			return "getHospitalBoard";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@RequestMapping(value = "/getHospitalRegForm")
	public String getHospitalRegForm(Model model) {
		model.addAttribute("hospitalBean", new HospitalBean());
		return "addHospitalFormDef";

	}

	@RequestMapping(value = "/addHopital", method = RequestMethod.POST)
	public String addHospital(@ModelAttribute("hospitalBean") HospitalBean hospitalBean, Model model) {
		System.out.println(hospitalBean.toString());
		hospitalBean = hospitalService.createHospital(hospitalBean);

		if (hospitalBean.getHospitalId() > 0) {
			try {
				List<HospitalBean> list = hospitalService.getAllHospital();
				System.out.println(list.size());
				model.addAttribute("uiHospList", list);
				return "getHospitalBoard";
			} catch (Exception e) {

			}
		}

		return null;

	}

	@RequestMapping(value = "/editHospital")
	public String editHospital(HttpServletRequest request, Model model) {

		String hospitalId = request.getParameter("hospitalId");
		System.out.println(hospitalId + "is hospitalId1");

		HospitalBean hospitalBean = hospitalService.getHospitalById((Integer.valueOf(hospitalId)));
		System.out.println(hospitalBean.getHospitalId() + "is id of fetched from database2");
		model.addAttribute("hospitalBean", hospitalBean);
		return "updateFormDef";

	}

	@RequestMapping(value = "/updateHospital", method = RequestMethod.POST)
	public String updateHospital(@ModelAttribute("hospitalBean") HospitalBean hospitalBean, Model model) {
		System.out.println(hospitalBean.getHospitalId() + "this hospital id in controller3");
		hospitalBean = hospitalService.updateHospital(hospitalBean);
		System.out.println(hospitalBean.getHospitalId() + "this hospital id in controller4");

		try {
			List<HospitalBean> list = hospitalService.getAllHospital();
			System.out.println(list.size());
			model.addAttribute("uiHospList", list);
			return "getHospitalBoard";
		} catch (Exception e) {

		}

		return "null";
	}

	@RequestMapping(value = "/delete")
	public String deleteHospital(HttpServletRequest request, Model model) {
		String hospitalId = request.getParameter("hospitalId");
		System.out.println(hospitalId + "is hospitalId");
		boolean b = hospitalService.deleteHospital(Integer.parseInt(hospitalId));

		System.out.println(b + "1");

		try {
			List<HospitalBean> list = hospitalService.getAllHospital();
			System.out.println(list.size());
			model.addAttribute("uiHospList", list);
			return "getHospitalBoard";
		} catch (Exception e) {

		}

		return "null";
	}

	@RequestMapping(value = "/searchHospital")
	public String searchHospital(HttpServletRequest request, Model model) {
		String searchKey = request.getParameter("searchKey");
		String searchValue = request.getParameter("searchValue");
		System.out.println(searchKey);
		System.out.println(searchValue);

		if ((searchKey != null && !searchKey.isEmpty()) && searchValue != null && !searchValue.isEmpty()) {
			if (searchKey.equals("HospitalName")) {

				try {
					List<HospitalBean> list = hospitalService.getHospitalByName(searchValue);
					System.out.println("this is controller");
					System.out.println(list.size());
					model.addAttribute("uiHospList", list);
					System.out.println(list.size());
					return "getHospitalBoard";
				} catch (Exception e) {
				}

			}
			if (searchKey.equals("Email")) {

				try {
					List<HospitalBean> list = hospitalService.getHospitalByEmail(searchValue);
					System.out.println("this is controller");
					System.out.println(list.size());
					model.addAttribute("uiHospList", list);
					System.out.println(list.size());
					return "getHospitalBoard";
				} catch (Exception e) {
				}

			}

			
			if(searchKey.equals("Address1")){
				
				try{
				List<HospitalBean> list = hospitalService.getHospitalByAddress1(searchValue);
				System.out.println(list.size()+"size in controller");
				model.addAttribute("uiHospList", list);
				return "getHospitalBoard";
				}catch(Exception e){}
			}
		}

		
		if(searchKey.equals("IsActive")){
			try{
				List<HospitalBean> list=hospitalService.getHospitalByStatus(searchValue);
				System.out.println(list.size());
				model.addAttribute("uiHospList", list);
				return "getHospitalBoard";
				
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		if(searchKey.equals("Phone")){
			try{
				long Value = Long.valueOf(searchValue);
				List<HospitalBean> list=hospitalService.getHospitalByPhoneNo(Value);
				System.out.println(list.size());
				model.addAttribute("uiHospList", list);
				return "getHospitalBoard";
				
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
			
		
		return "null";
	}

	@RequestMapping(value ="/getAllHospitalsByPaging" )
	public String getAllHospitalsByPaging(HttpServletRequest request,Model model){
				
	String cPage =	request.getParameter("currpage");
	int currentPage = Integer.valueOf(cPage);
	System.out.println(currentPage);
List<HospitalBean> list =hospitalService.getAllHospitalByPagination(currentPage, ServiceConstants.NUM_REC_PER_PAGE);
System.out.println(list.size()+"size in controller");
model.addAttribute("uiHospList", list);



List<HospitalBean> hosplist = hospitalService.getAllHospital();
int listSize = hosplist.size();
int pageBarSize = Math.round((listSize/ServiceConstants.NUM_REC_PER_PAGE)+1) ;
List<Integer> pageBarList = new ArrayList(); 
for(int i=0;i<pageBarSize; i++){
	pageBarList.add(i);
	System.out.println(i);
}
model.addAttribute("pageBarList",pageBarList);

		return "getHospitalBoard";
	}
	
}
