package com.example.cicd_example.car;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepository {

    public List<Car> getAllCars(){
        return Arrays.asList(
                Car.builder()
                        .id(1)
                        .brand("Ford")
                        .model("Bronco")
                        .manufacturedYear(2020)
                        .color("Blue")
                        .price(BigDecimal.valueOf(25000))
                        .currency("US$")
                        .build(),
                Car.builder()
                        .id(2)
                        .brand("Toyota")
                        .model("Accord")
                        .manufacturedYear(2023)
                        .color("Gray")
                        .price(BigDecimal.valueOf(21000))
                        .currency("US$")
                        .build(),
                Car.builder()
                        .id(3)
                        .brand("GM")
                        .model("Camaro")
                        .manufacturedYear(2023)
                        .color("Green")
                        .price(BigDecimal.valueOf(32000))
                        .currency("US$")
                        .build(),
                Car.builder()
                        .id(4)
                        .brand("BMW")
                        .model("X3")
                        .manufacturedYear(2023)
                        .color("Brown")
                        .price(BigDecimal.valueOf(27000))
                        .currency("US$")
                        .build()
        );
    }

    public Car getById(Integer id){
        return getAllCars().stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

}
