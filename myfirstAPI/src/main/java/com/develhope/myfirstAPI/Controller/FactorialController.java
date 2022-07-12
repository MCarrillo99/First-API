package com.develhope.myfirstAPI.Controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{number}")
    public Integer getFactorial(@PathVariable Integer number){
        Integer factorialResult = 1;
        for (int i = number; i >= 1 ; i--){
            factorialResult *= i;
        }

        return factorialResult;
    }

}
