package com.develhope.myfirstAPI.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
public class StringController {


    @GetMapping("/strings")
    public String getString(@RequestParam String s1, @RequestParam(required = false) String s2){
        if (s2 == null){
            return s1;
        }
        return s1+s2;
    }

}
