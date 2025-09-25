package org.example.springbootpractice.With_DI_XMLBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXMLDIConstuctor {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmlDI/types/constructor/applicationContext.xml");


        Car car = (Car) context.getBean("car");
        car.start();


    }
}
