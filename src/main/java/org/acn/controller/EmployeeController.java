package org.acn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class EmployeeController {
	
	
	@RequestMapping(value = "/employee")
	public String actionEmployees(Model model){
		model.addAttribute("name","David");
    	return "employeeDetails";
		
	}

	
}
