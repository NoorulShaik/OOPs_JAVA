package Inhertance;

public class MultiLevelInhertance {
    public static void main(String[] args) {
        CSEStudent cs = new CSEStudent();
        cs.attendProgram();
        cs.attendLab();
        cs.marAttendence();
    }
}
class NoorulStud{
    String name;
    int age;
    //Parent Class(Super Class)
    void marAttendence(){
        System.out.println("Attendence is marked");
    }

}
class EngineeringStud extends NoorulStud{
    //child class or SUb Class
    void attendLab(){
        System.out.println("Lab Attended.");
    }
}
class CSEStudent extends EngineeringStud{
    void attendProgram(){
        System.out.println("I do a lot of Programming");
    }
}
