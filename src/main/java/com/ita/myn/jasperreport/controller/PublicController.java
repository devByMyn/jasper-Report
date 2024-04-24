package com.ita.myn.jasperreport.controller;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

    @GetMapping("/home")
    public String home() {
        System.out.println("employee system");
        return "index";
    }
}
