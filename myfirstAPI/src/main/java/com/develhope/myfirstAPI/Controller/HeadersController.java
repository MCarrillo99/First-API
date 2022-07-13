package com.develhope.myfirstAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpHeaders;
import java.util.List;

@RestController
public class HeadersController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        return "the host name and port is: "+headers.getHost().toString();
    }

}
