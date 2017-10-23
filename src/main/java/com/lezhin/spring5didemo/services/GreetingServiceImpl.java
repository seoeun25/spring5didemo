package com.lezhin.spring5didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author seoeun
 * @since 2017.10.21
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_SEOEUN = "Hello Seoeun!!!!";
    @Override
    public String sayGreeting() {
        return HELLO_SEOEUN;
    }
}
