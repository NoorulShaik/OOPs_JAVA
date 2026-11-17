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