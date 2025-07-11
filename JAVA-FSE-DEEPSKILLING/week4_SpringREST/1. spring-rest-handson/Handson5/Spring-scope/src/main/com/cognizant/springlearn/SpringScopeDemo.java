package com.cognizant.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopeDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);
        System.out.println(country);

        Country anotherCountry = context.getBean("country", Country.class);
        System.out.println(anotherCountry);

        ((ClassPathXmlApplicationContext) context).close();
    }
}