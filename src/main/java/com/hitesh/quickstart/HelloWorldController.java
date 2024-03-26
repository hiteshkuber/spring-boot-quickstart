package com.hitesh.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hitesh")
    public String basicPrint() {
        return "Hitesh needs raise";
    }
}
