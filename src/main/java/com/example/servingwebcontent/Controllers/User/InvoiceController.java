package com.example.servingwebcontent.Controllers.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
    
    @GetMapping("/invoice")
    public String index() {
        return "User/Invoice/invoice";
    }
}
