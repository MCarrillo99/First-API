package com.develhope.myfirstAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

     @GetMapping("/name")
     public String myName(){
         return "Michele";
     }

     @PostMapping("/name")
     public StringBuilder myReverseName(){
         return new StringBuilder(myName()).reverse();
     }

}
