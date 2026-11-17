public class File {
    /*
    All about static and final keywords in java..!
     static keyword:
     can be applied for both variables and methods.It makes the variables class specific rather object specific
     Rules:
     -->One static method can only call other static method
    -->Static method can only access static variables
    -->Doesn't have access " this " keyword.
     */

    /*
    final keyword.

     */
    final double PI_VAL = 3.1415; //Initialize and declare both should be done at same time .naming convention use ALL CAPS
    static String nrl;
    static {
        /*
        Used to assign static variables.
        To write a static block in Java, use the static keyword followed by curly braces {} directly inside a class body.
        The Java Virtual Machine (JVM) runs this code automatically once when the class is first loaded into memory,
        before any objects are created and before the main() method executes
         */
        nrl = "Noorul Hussain";
        System.out.println("Static block first");
    }
    static void fianlCheck(){
        final int x;
        x = 10; //This is fine in method.
    }
    public static void main(String[] args) {
        final int x;
        x = 18; //in methods we can declare and initialize individually.

        System.out.println("Main block next");
        Stud s1 = new Stud(41,"Noorul");
        Stud s2 = new Stud(42,"Noorul Hussain");
        Stud.college = "MITS";
       // s2.college = "MBU"; This changes the static variables value.
        System.out.println(s1.name +" " + s1.roll + "  " + Stud.college);
    }
}
class Stud{
        int roll;
        String name;//These are instance variables
        static String college = "MITS"; //This is called class Variable
        final int age;

        public Stud(int roll, String name) {
            this.roll = roll;
            this.name = name;
            this.age = 20;
        }
}
