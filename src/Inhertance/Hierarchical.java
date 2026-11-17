package Inhertance;

public class Hierarchical {
    public static void main(String[] args) {

    }
}
class Student{ //parent --A
    String name;
    int age;
    //Parent Class(Super Class)
    void marAttendence(){
        System.out.println("Attendence is marked");
    }

}
class EngineeringStudet extends Student{ //child --B
    //child class or SUb Class
    void attendLab(){
        System.out.println("Lab Attended.");
    }
}
class MedicalStudent extends Student{ //child --C
    void attendProgram(){
        System.out.println("I do a lot of Programming");
    }
}
