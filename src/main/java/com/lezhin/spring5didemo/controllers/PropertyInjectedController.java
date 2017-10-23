package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingService;
import com.lezhin.spring5didemo.services.GreetingServiceImpl;

import org.springframework.stereotype.Controller;

/**
 * @author seoeun
 * @since 2017.10.21
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
