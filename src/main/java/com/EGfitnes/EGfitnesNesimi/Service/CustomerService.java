package com.EGfitnes.EGfitnesNesimi.Service;

import com.EGfitnes.EGfitnesNesimi.Model.response.CustomerResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CustomerService {
    public CustomerResponse getFilial(String branch){
        System.out.println("Axtarilan Filial:"+branch);
        return CustomerResponse.builder()
                .branch("Nesimi")
                .capacity(300)
                .services(List.of("Spa","Trenajor","Hamam","Hovuz"))
                .employeeCount(40)
                .openTime(LocalTime.of(9,00))
                .closeTime(LocalTime.of(00,00))
                .build();
    }
}
