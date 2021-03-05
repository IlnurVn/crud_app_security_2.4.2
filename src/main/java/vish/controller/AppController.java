package vish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String showFirstView() {

        return "hello";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }

}
