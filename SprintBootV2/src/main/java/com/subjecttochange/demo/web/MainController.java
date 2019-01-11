package com.subjecttochange.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Value("${spring.application.name}")
    public String appname;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appname);
        return "home";
    }
    @GetMapping("/test")
    public String testPage(Model model) {
        model.addAttribute("appName", appname);
        return "test";
    }

}
