package Inhertance;

public class SUper {
    public static void main(String[] args) {
        TempEmp te = new TempEmp("Noorul",20,67,"Amazon");
        te.print();
    }
}
/*
"super" refers to the parent object.
you could say opposite to "this" keyword.
 */
class Emp{
    String name;
    int age ;
    int x;

    public Emp() {
    }

    public Emp(String name, int age, int x) {
        this.name = name;
        this.age = age;
        this.x = x;
    }

    void print(){
        System.out.println("Inside Parent class print method");
        System.out.println(name + " " + age +" " + x);
    }
}
class TempEmp extends Emp{
    String company = "Shag";
//    int duration;
//    int x = 5;

    public TempEmp(String name , int age ,int x ,String company) {
        super(name,age,x);
        this.company = company;
    }

    void print(){
        System.out.println("calling parent class print method");
        super.print();
        System.out.println(company);
    }
}
