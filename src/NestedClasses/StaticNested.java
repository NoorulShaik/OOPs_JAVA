package NestedClasses;

public class StaticNested {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner ob = new Outer.Inner(outer);
        ob.fun();
        /*
        You create an object of a static nested class when you need independent instances with their own separate data (non-static variables and methods).
         The static keyword on a nested class does not make its internal members static. Instead, it only detaches the nested class from needing
         an instance of the outer class.
         When no object is needed. If the static nested class only contains static methods and static variables, you actually do not need to create an object for it.
         You can call them directly using OuterClass.StaticNestedClass.staticMethod().
         class LinkedList {
    // Static nested class: a Node doesn't need a reference to the whole LinkedList
    static class Node {
        int data;       // Non-static: each Node holds its own number
        Node next;      // Non-static: each Node points to its own next Node

        Node(int data) {
            this.data = data;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // We MUST create objects because each Node stores different data
        LinkedList.Node first = new LinkedList.Node(10);
        LinkedList.Node second = new LinkedList.Node(20);

        first.next = second;
    }
}

         */
    }
}
/*
Key properties
1.Doesnt need an instance of Outer class
2.Class can be instantiated like Normal class
3.Can access only static members of Outer class(same as static methods)
4.Can access a non static member by having a reference of Outer class
5.It is just like Normal class & can do anything an Outer class does
 */
class Outer{
    private static int a = 100;
    int x = 8;
    static class Inner{
        Outer outer; //refernece variable
        Inner(Outer outer){
            this.outer = outer;
        }
        void fun(){
            System.out.println("Fun from inner class");
            System.out.println(a);
            System.out.println(outer.x);
        }
    }
}
