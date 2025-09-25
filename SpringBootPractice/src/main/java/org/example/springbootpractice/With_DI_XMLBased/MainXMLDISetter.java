package org.example.springbootpractice.With_DI_XMLBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXMLDISetter {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlDI/types/setter/applicationcontext.xml");
        Car car = (Car) context.getBean("car");
        car.start();
    }
}
