package com.example.cicd_example.car;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars(){
        List<Car> allCars = carService.getAllCars();
        if (allCars.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<>());
        }
        return ResponseEntity.ok(allCars);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") Integer id){
        Car byId = carService.getById(id);
        System.out.println("CAR id[" + id + "]: " + byId);
        if (byId == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(byId);
    }

}
