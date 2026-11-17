public class File2 {
    public static void main(String[] args) {
//        int x;
//        System.out.println(x); //Error local variable x might not have been inistialised
//


//        Noorul obj1 = new Noorul();
//        System.out.println(obj1.age);
//        System.out.println(obj1.name);
//        System.out.println(obj1.roll);
//        System.out.println(obj1.marks);
        Noorul s2 = new Noorul(21,41,98,"Noorul","MITS");
        System.out.println(s2.age);
        System.out.println(s2.roll);
        System.out.println(s2.college);
        System.out.println(s2.name);
    }
}
class Noorul{
    int age;
    int roll;
    float marks;
    String name , college;

    public Noorul(int age, int roll, float marks, String name, String college) {
        this.age = age;
        this.roll = roll;
        this.marks = marks;
        this.name = name;
        this.college = college;
    }
    //Default values of these instance variables are as follows
    /*
    Integer --> 0
    boolean -->false
    String ---> null
    float -->0.0

    Rules of constructor:
    1.Same Name as Class
    2.No return type
    3.Automatically called during the object creation
    4.Used to initialize an object
    5.It can allow to overload

    Uses of a Constructor
    .Initialize the Object(instance) with initial values
    .Allocate the resources
    .Validate the data (checking the incoming instance values before assigning)

    Constructors are mandatory in java
    Even if you dont write one java will write one for you i.e, called Default constructor.
    If you write one that is called parameterized constructor.

    THIS KEYWORD:
    " this " stores the reference of the current object.
    for example Studnet s1 = new Student();
    this acts like s1 here in constructors!!
    Uses ??
    To overcome the ambiguity between identifiers of instance variables and parameters of Constructor.
    Chaining in constructors.!! this(par1,par2); -->basically calling the overloaded constructors when no or mismatched parameters passes from main.
    this(); --->This line must be at the top if you are using this() in your constructor.


     */
}
