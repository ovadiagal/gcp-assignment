package com._0.gcp_assignment;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/username")
    public String hello() {
        return "govadia3";
    }

    @GetMapping("/time")
    public String time() {
        LocalTime now = LocalTime.now();
        return "The time is " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
