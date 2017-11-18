/**
 * 
 */
package com.dotridge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dotridge.bean.LoginBean;
import com.dotridge.bean.ManageUserProfileBean;

/**
 * @author Raghu
 *
 */
@Controller
public class HomeController {
	@RequestMapping(value="/home")
	public  String getHomePage() {
		return"home";
		
	}
	@RequestMapping(value="/getLoginPage")
	public  String getLoginPage(Model model) {
		model.addAttribute("loginBean",new LoginBean());
		return"login";
		
	}

	@RequestMapping(value="/login")
	public  String doLogin(@ModelAttribute("loginBean")LoginBean loginBean) {
		
		String userName = loginBean.getUserId();
		if(userName != null && !userName.isEmpty()){
			System.out.println();
			if(userName.equalsIgnoreCase("superadmin@email.com"))
					{
				//getSuperadminBoard
				System.out.println(loginBean.toString());
				return "getSuperadminBoard";
							}
		
		
		}
		return"home";

}

	@RequestMapping(value="/getSignUpPage")
	public String getRegistrationPage(Model model){
		model.addAttribute("manageUserProfileBean", new ManageUserProfileBean());
		return "registration" ;
	}
	@RequestMapping(value="/reg")
	public String doRegistration(@ModelAttribute("manageUserProfileBean")ManageUserProfileBean manageUserProfileBean){
		System.out.println(manageUserProfileBean.toString());
		return "registration" ;
	}
}