package Abstraction;
/*
Interfaces defines " what " an object can do without telling " how " it does that.

Its is also called Contract (The class which implements this interface must define the behaviour (methods).

"Blue print of Behaviour"

 */
public class DeepInterface {
    public static void main(String[] args) {
    Payment p = new CreditCard();
    p.pay();
    Payment d = new DebitCard();
    d.pay();
    //dehko same interface diff implementation..

    }
}
interface Cars{
    void drive(); // this abstract function is public by default

}
//class Thar implements Cars{
//    //The responsibility of this class which implements the interface is to define all the abstract methods presents in interface
//    //and must be public since the declaration is public we can't narrow down the visibility
//    @Override
//    public void drive(){
//        System.out.println("Thar drives brother!!");
//    }
//    //If even this Thar class fails to define the drive method we need to make the method drive as abstract Then follwed by making class also abstract.
//    //If a class have atleast one abstract method then we need to make the class  an abstract class.
//}


abstract class Thar implements Cars{
    abstract public void drive();
}
class BlackThar extends Thar{
    @Override
    public void drive() {
        System.out.println("Black thar is running!!!");
    }
}

//polymorphism

interface Payment{
    void pay();
}
//pay can be used in multiple class
class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying through the debitCard!");
    }
}
class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Paying vis the Credit card..");
    }
}
