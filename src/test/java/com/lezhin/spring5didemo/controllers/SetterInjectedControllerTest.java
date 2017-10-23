package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author seoeun
 * @since 2017.10.24
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_SEOEUN, setterInjectedController.sayHello());
    }
}
