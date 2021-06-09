package com.example.servingwebcontent.Controller.Admin;

import com.example.servingwebcontent.Model.Menu;
import com.example.servingwebcontent.Repository.MenuRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {
    
    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/admin/menu")
    public String index(Model model){
		return "Admin/Menu/menu";	
    }

    @GetMapping("/admin/menu/data")
    public @ResponseBody Iterable<Menu> data() {
        // This returns a JSON or XML with the users
        return menuRepository.findAll();
    }
}
