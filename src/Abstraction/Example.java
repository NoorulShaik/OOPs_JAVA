package Abstraction;

public class Example {
    /*
    Showing only the what, hiding the how.

    Analogy
    Driving a car.
    You know the steering wheel turns the car and the pedal accelerates it — you don't need to know the fuel injection timing or transmission logic.
    The dashboard is the abstraction; the engine is the hidden complexity.

    Achieved in Java via abstract classes and interfaces.
  */


    /*
    In Java, abstraction hides complex implementation details to show only essential features,
    while encapsulation bundles data and methods into a single unit to protect internal state.
    Abstraction focuses on what an object does at the design level,
    whereas encapsulation focuses on how data is secured and accessed at the implementation level.

Key Differences


Feature	Abstraction	Encapsulation
Core Purpose	Hides internal implementation complexity and exposes only relevant behavior.	Wraps variables and methods together while restricting direct external access.

     */
    public static void main(String[] args) {
    Car cr = new Electric();
    cr.start();
    cr.accelerate();

    cr.brake();
    }
}
abstract class Car{
    void start(){
        System.out.println("Car is starting!!");
    }
    abstract void accelerate();
    abstract void brake();
}
class Electric extends Car{
    @Override
    void accelerate(){
        System.out.println("Ev is accelerating");
    }
    @Override
    void brake(){
        System.out.println("EV is stopped!");
}
class Diesel extends Car {
        @Override
    void accelerate() {
        System.out.println("Ev is accelerating");
    }
    @Override
    void brake() {
        System.out.println("EV is stopped!");
    }
}
}
