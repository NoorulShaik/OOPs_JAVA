package Abstraction;

public class Interface {
    public static void main(String[] args) {
    Car1 cr = new EV();
    cr.brake();
    cr.start();
    cr.accelerate();
    }
}
/*
Interfaces --responsibilities/roles
interfaces never have relation with objects
multiple inheritance supports Interfaces.

Abstract class --families of similar object
these abstract class ,ay have relation with objects.
 */
interface Car1{

    void start();
    void accelerate();
    void brake();
    //all the above methods are abstract
    //implemented classes must have all the methods
    //contract between class.
}
class FuelCar implements Car1 {
    @Override
    public void start() {
        System.out.println("Fuel started");

    }

    @Override
    public void accelerate() {
        System.out.println("Fuel accelerate");

    }

    @Override
    public void brake() {
        System.out.println("Fuel brake");

    }
}

    class EV implements Car1 {


    @Override
    public void start() {
        System.out.println("EV started");

    }

    @Override
    public void accelerate() {
        System.out.println("EV accelerate");

    }

    @Override
    public void brake() {
        System.out.println("EV brake");

    }
}


