package com.example.cicd_example.car;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    private Integer id;
    private String brand;
    private String model;
    private Integer manufacturedYear;
    private String color;
    private BigDecimal price;
    private String currency;
}
