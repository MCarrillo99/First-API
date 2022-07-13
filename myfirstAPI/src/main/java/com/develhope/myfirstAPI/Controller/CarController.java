package com.develhope.myfirstAPI.Controller;

import com.develhope.myfirstAPI.DTO.CarDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/cars")
    public CarDTO getCar(){
        return new CarDTO();
    }

    @PostMapping("/cars")
    public String postCar(@RequestBody CarDTO car){
        return car.toString();
    }

}
