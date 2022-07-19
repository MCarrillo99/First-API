package com.develhope.myfirstAPI.Controller;

import com.develhope.myfirstAPI.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
public class CarController {

    @GetMapping("/cars")
    public CarDTO getCar(){
        return new CarDTO();
    }

    @PostMapping("/cars")
    public ResponseEntity<String> postCar(@Valid @RequestBody CarDTO car){
        System.out.println(car.toString());
        return new ResponseEntity<>("a new car was been created ",HttpStatus.CREATED) ;
    }

}
