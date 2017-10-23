package com.lezhin.spring5didemo;

import com.lezhin.spring5didemo.controllers.ConstructorInjectedController;
import com.lezhin.spring5didemo.controllers.PropertyInjectedController;
import com.lezhin.spring5didemo.controllers.SetterInjectedController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Spring5DiDemoApplication {

	@Bean
	@Scope("prototype")
	Logger logger(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
