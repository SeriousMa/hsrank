package com.serious.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Serious on 2017/1/4.
 */
@RestController
@EnableAutoConfiguration
public class SimpleController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
