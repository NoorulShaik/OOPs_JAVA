package NestedClasses;

public class InnerClass {
    public static void main(String[] args) {
        OuterC outer = new OuterC();

        OuterC.Inner inner = outer.new Inner(); //I cant do this.
        inner.fun();
        //we can combine the above lines into one
       // OuterC.Inner inner = new OuterC().new Inner();
    }
}

class OuterC{
    class Inner{
        void fun(){
            System.out.println("Inner class");
        }
    }
}