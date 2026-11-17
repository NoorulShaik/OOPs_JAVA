package Inhertance;

public class SUper {
    public static void main(String[] args) {
        TempEmp te = new TempEmp();
        te.print();
    }
}
/*
"super" refers to the parent object.
you could say opposite to "this" keyword.
 */
class Emp{
    String name;
    int age = 19;
    int x = 4;
    void print(){
        System.out.println("Inside Parent class print method");
        System.out.println(age +" " + x);
    }
}
class TempEmp extends Emp{
    String name = "Shag";
    int duration;
    int x = 5;
    void print(){
        System.out.println("calling parent class print method");
        super.print();
        System.out.println(x +" " + " " +name);
    }
}
