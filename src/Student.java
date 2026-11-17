public class Student {
    public static void main(String[] args) {
        Std s1 = new Std();
        Std s2 = new Std();
        s1.college ="MITS";
        s1.age = 20;
        s1.name ="Noorul";
        s1.rollNo = 41;
        s1.martAttendence();s1.print();
    }
}
class Std{
    int age;
    String name;
    int rollNo;
    String college;
    Std(){
        System.out.println("Object is Created");
    }
    //The above are the fields/properties/attributes of a real world entity.
    //Any class represents a realWorld entities --Characteristics -- Behavior.
    void martAttendence(){
        System.out.println("Attendence Marked by: "+ name);
    }
    void print(){
        System.out.println("Student Details:");
        System.out.println(name +" ," + age +" ," +rollNo +" ," + college);
    }
}