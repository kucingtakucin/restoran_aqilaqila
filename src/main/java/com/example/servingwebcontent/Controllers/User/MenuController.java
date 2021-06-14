package com.example.servingwebcontent.Controllers.User;


import com.example.servingwebcontent.Models.Menu;
import com.example.servingwebcontent.Repositories.MenuRepository;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {
    
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/menu")
    public String index() {
		return "User/Menu/menu";	
    }

    @GetMapping("/menu/data")
    public @ResponseBody Iterable<Menu> data() {
        // This returns a JSON or XML with the users
        return menuRepository.findAll();
    }
}
