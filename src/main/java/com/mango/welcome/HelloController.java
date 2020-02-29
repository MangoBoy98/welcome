package com.mango.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 凌风的MI
 */
@Controller
public class HelloController {

    @GetMapping("/index")
    public String hello(){
        return "index";
    }
}
