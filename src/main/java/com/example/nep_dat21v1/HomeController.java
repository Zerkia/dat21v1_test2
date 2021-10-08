package com.example.nep_dat21v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
      return "index";
    }

    @GetMapping("/shout")
    public String shout(){ return "greet";}
}
