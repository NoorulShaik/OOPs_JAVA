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
    /*
    ## Common Questions & Answers

* 1. Can abstract classes have constructors? -> Yes
* Even though you cannot instantiate an abstract class directly, its constructor is called via super() when a child class object is created to initialize shared fields.
* 2. Can abstract classes be final? --> No
* A final class cannot be inherited, which directly contradicts the purpose of an abstract class (which must be extended).
* 3. Can abstract classes have static methods/variables? --> Yes
* Static variables and non-abstract static methods belong to the class itself and can be accessed using the abstract class name. However, a method cannot be both abstract and static.
* 4. Can abstract classes have private methods? --> Yes, but non-abstract
* You can write private helper methods inside an abstract class to support its concrete methods. However, an abstract method cannot be private because subclasses need access to override it.
* 5. Can abstract classes have final methods? --> Yes, but non-abstract
* You can mark concrete methods as final to prevent subclasses from overriding them. However, an abstract method cannot be final because it requires overriding.
* 6. Can abstract classes have no abstract methods? --> Yes
* Declaring a class abstract without any abstract methods is valid in Java. This is often done simply to prevent anyone from creating direct instances of that class.
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
