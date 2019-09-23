package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
        public String homepage(){
            return "index";
        }

    @RequestMapping("/photos")
        public String photos(){
            return "photos";
    }
    @RequestMapping("/gumbo")
        public String gumbo(){
            return "gumbo";
    }
    @RequestMapping("/crabcake")
        public String crab(){
            return "crabcake";
    }
    }

