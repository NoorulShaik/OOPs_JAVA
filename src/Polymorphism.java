public class Polymorphism {
    /*
    Polymorphism : many -- forms
     Same object behaves or responds differently on same command if one paremeter is changed.
     Ex:
      Method Overloading. -->Compile time polymorphism
      Method Overriding  -- > Run time polymorphism
     */
    public static void main(String[] args) {
    A a = new B();
    a.fun();
    }
}
//static -- they belong to class not to objects.
//private methods can't be overridden they dont be accessed in child classes
//final
//final before class---? obvious you cant create a child class for that final class
//Fields / variables can not be polymorphic
class A{
    static void fun(){
        System.out.println("Hello!");
    }
    private void fun2(){
        System.out.println("Hey there!");
    }
    final void fun3(){
        System.out.println("Final boss");
    }
}
class B extends A{
    static void fun(){
        System.out.println("Bye!"); //This wont be overridden because static
    }
//    void fun3(){
//
//    }
}
