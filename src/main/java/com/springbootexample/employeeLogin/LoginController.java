package com.springbootexample.employeeLogin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pranaychalasani on 8/29/17.
 */


@RestController
public class LoginController {

    @RequestMapping(value = "/login")
    public String greetings(){
        return "Hello welcome to the demo page";
    }
}
