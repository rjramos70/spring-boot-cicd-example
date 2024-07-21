package com.example.cicd_example.car;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.getAllCars();
    }

    public Car getById(Integer id){
        return carRepository.getById(id);
    }
}
