package com.linteresting.designpatterns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        // Driver driver = (Driver) context.getBean("driver");
        Tank tank = (Tank) context.getBean("tank");
    }

}
