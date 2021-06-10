package com.example.servingwebcontent.Controllers.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String index() {
        return "Auth/login";
    }
}
