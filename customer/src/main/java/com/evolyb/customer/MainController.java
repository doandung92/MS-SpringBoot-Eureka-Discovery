package com.evolyb.customer;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.*;

@RestController
public class MainController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo(){
        return "My name is SoSo";
    }

    @GetMapping("/api")
    public String api(){
        String result = restTemplate.getForObject("http://customers/info",String.class);
        return result;
    }
}
