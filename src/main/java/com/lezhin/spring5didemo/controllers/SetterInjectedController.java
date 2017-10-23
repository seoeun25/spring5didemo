package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingService;

/**
 * @author seoeun
 * @since 2017.10.24
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
