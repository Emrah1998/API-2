package com.EGfitnes.EGfitnesNesimi.Model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerResponse {
    private String branch;
    private LocalTime openTime;
    private LocalTime closeTime;
    private Integer capacity;
    private Integer employeeCount;
    private List<String> services;
}
