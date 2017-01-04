package com.serious.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Serious on 2017/1/4.
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}
