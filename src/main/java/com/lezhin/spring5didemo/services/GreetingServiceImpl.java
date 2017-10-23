package com.lezhin.spring5didemo.services;

/**
 * @author seoeun
 * @since 2017.10.21
 */
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_SEOEUN = "Hello Seoeun!!!!";
    @Override
    public String sayGreeting() {
        return HELLO_SEOEUN;
    }
}
