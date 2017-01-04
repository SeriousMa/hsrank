package com.serious.main;

import com.serious.controller.SimpleController;
import org.springframework.boot.SpringApplication;

/**
 * Created by Serious on 2017/1/4.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleController.class, args);
    }
}
