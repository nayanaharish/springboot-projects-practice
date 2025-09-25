package org.example.springbootpractice.With_DI_XMLBased;

public class Car {

    private Engine engine1;

    public Car() {
        System.out.println("Car Constructor");
    }

    public Car(Engine engine)
    {

        System.out.println("Inside Car Constructor");
        this.engine1 = engine;
    }

    public void setEngine1(Engine engine) {
        System.out.println("Inside setEngine1");
        this.engine1 = engine;
    }

    public void start()
    {
        engine1.start();
        System.out.println("Car started");
    }
}
