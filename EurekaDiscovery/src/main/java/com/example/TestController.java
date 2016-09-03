package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ravi on 9/3/2016.
 */
@RestController
public class TestController {
    @Value("${testname}")
    private String testName;

    @RequestMapping("/test")
    public String showLuckyWord() {
        return "The lucky word is: " + testName;
    }
}
