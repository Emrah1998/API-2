package com.EGfitnes.EGfitnesNesimi.Controller;

import com.EGfitnes.EGfitnesNesimi.Model.response.CustomerResponse;
import com.EGfitnes.EGfitnesNesimi.Service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/EGfitnes")
public class CustomersController {
    private final CustomerService customerService;

    @GetMapping("/{branch}")
    public CustomerResponse getFilial(@PathVariable String branch){
        return customerService.getFilial(branch);
    }
}
