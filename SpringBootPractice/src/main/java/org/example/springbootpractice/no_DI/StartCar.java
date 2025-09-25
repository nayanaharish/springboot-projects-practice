package org.example.springbootpractice.no_DI;

public class StartCar {

    /*
    * Car is tightly coupled to Engine → cannot easily replace Engine without modifying Car.

    Not testable easily → you cannot inject mock Engine for unit testing.

    Good to see the difference with DI examples (XML or Annotation).*/


    public static void main(String[] args) {
        Car car = new Car(new Engine());
        car.drive();

    }
}
