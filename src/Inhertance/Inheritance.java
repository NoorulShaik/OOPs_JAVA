package Inhertance;

public class Inheritance {
     /*
     Uses of inheritance are
     1.Code reusability
     2.support polymorphism
      */
     public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.marAttendence();
        es.attendLab();
        //es have access to both methods/objects
         //Lets try to create object for Student class and check can we access both or not ?
         NoorulStudent ns = new NoorulStudent();
         ns.marAttendence();

     }
}

class NoorulStudent{
    String name;
    int age;
 //Parent Class(Super Class)
    void marAttendence(){
        System.out.println("Attendence is marked");
    }

}
class EngineeringStudent extends NoorulStudent{
    //child class or SUb Class
    void attendLab(){
        System.out.println("Lab Attended.");
    }
}
/*
TYPEs of Inhertance.Inheritance
1.Simple Inhertance.Inheritance A-->B (-->extends)
2.multi-level Inhertance.Inheritance A-->B-->C
3.Hierarchical Inhertance.Inheritance
    A
  /   \
 B     C
4.Multiple Inhertance.Inheritance(not supported in java) still there is a way to do it (using Interfaces).
    oppposite to Hierarchical
    A    B (these are parents)
    \    /
       C(this is child)

       why not supported ?
       Due to ambiguity! (Diamond Problem).

 */