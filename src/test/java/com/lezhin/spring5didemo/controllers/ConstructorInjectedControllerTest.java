package com.lezhin.spring5didemo.controllers;

import com.lezhin.spring5didemo.services.GreetingServiceImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author seoeun
 * @since 2017.10.24
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_SEOEUN, constructorInjectedController.sayHello()) ;
    }
}
