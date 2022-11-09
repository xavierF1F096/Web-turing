package com.turing.turingweb.RestControlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(path = "turing/api/v1")
public class RestControllerIndex {
    
    @GetMapping
    public String index(){
        return "index";
    }

}
