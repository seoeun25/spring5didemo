package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingService;
import com.lezhin.spring5didemo.services.GreetingServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author seoeun
 * @since 2017.10.21
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
