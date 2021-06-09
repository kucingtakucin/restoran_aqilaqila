package com.example.servingwebcontent.Controllers.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    
    @GetMapping("/admin")
	public String index(){
		return "Admin/Home/home";	
    }
}
