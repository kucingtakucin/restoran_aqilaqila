package com.example.servingwebcontent.Controllers.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    
    @GetMapping("/menu")
	public String index(){
		return "User/Menu/menu";	
    }
    
    @GetMapping("/create")
	public String create(){
		return "User/Menu/create";	
    }


}
