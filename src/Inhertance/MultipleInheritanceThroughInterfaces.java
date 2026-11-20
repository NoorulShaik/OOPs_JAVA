package Inhertance;

public class MultipleInheritanceThroughInterfaces {
    public static void main(String[] args) {
        Greet g = new Greet();
//        g.hello();
//        g.hi();
        //am able to call all the methods of both interfaces.
//    CC o = new CC();
//    o.funn();
//    o.funn2();
//    D ob = new D();
//    ob.fun();
    Co c = new Co();
    c.fun();
    }

}
//multiple Inheritance --> Interfaces
/*
what was the reason for multiple inheritance not supported in java?
that is because of ambiguity and diamond problem (compiler sucks which method to call when a method of parent class is overridden );

How interfaces solved the diamond problem?
dek bro interfaces ke andar abstract methods hateso unko hame declare kartin uttach define nai katrin;
Define kon kartin?
jo bi class us interface ko implement karta hai ooo class karlega Override.
when two interfaces are there(they only have declarations)?
hence we can easily inherit from both interfaces and override the method(that was causing confusion in classes)
thats how multiple inheritance is supported with the help of Interfaces.
 */
interface A{
    void hello();
}
interface B{
    void hi();
}
class Greet implements A,B{
    @Override
    public void hi() {
        System.out.println("Hi");
    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}

//lets see the interfaces inheritance
interface AA{
    void funn();
}
interface BB extends AA{
    void funn2();
}
class CC implements BB{
    //this class must implement all the methods even we are implementing BB, BB it is extending AA
    //Hence we override both the methods.
    @Override
    public void funn() {
        System.out.println("Funny");
    }

    @Override
    public void funn2() {
        System.out.println("Funny2");

    }
}
//Example of multiple inheritance

interface ClassA{
    void fun();
}
interface ClassB extends ClassA{
    void fun();
}
interface ClassC extends ClassB{
    void fun();
}
class D implements ClassB ,ClassC{
    @Override
    public void fun() {
        System.out.println("THis is the implementation!");
    }
}
//Java Resolution priority rule.
/*
When a class extends aother class and Implements an Interfaces both having same method(again diamond problem senario)
In such cases Java execute the method of class not the interface.
 If you want to override it you can do that.

 */
interface O{
    default void fun(){
        System.out.println("Inside O");
    }
}
class BO {
    public void fun(){
        System.out.println("Inside BO");
    }
}
class Co extends BO implements O{
    @Override
    public void fun() {
       // O.super.fun();
    }
}