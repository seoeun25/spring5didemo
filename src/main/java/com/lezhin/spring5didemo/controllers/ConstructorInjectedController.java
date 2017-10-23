package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingService;

/**
 * @author seoeun
 * @since 2017.10.21
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
