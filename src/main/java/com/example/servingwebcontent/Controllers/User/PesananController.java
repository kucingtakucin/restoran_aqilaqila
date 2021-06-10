package com.example.servingwebcontent.Controllers.User;

import com.example.servingwebcontent.Models.Pesanan;
import com.example.servingwebcontent.Repositories.PesananRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PesananController {
    
    @Autowired
    private PesananRepository pesananRepository;

    @PostMapping("/order")
    public @ResponseBody Pesanan insert(
        @RequestBody @Validated Pesanan order
    ) {
        return pesananRepository.save(order);
    }

}
