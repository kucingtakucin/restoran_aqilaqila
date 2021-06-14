package com.example.servingwebcontent.Controllers.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
    
    @GetMapping("/invoice")
    public String index() {
        return "User/Invoice/invoice";
    }
}
