public class AutoBoxUnboxWrapperClassess {
    public static void main(String[] args) {
        /*
        why wrapper classes?
        1.collection framework
        2.extra functionalities
        Wrapper classes in Java are used to convert primitive data types (like int, char, and boolean)
        into full-fledged objects.
        int -- Integer
        float --Float
        char --Character
        etc...


        why then primitives exists?
        1.legacy (old languages had them
        2.faster than wrapper classes
         */
        int x = 4;
        Integer y = x; //this is called autoboxing java takes care.
        System.out.println(y);//unboxing is happening here as well y.intValue() is replaced with just y
        int z = y; //Unboxing in java
        Integer a = 100;
        Integer b = 1000; //If the values of a and b are same then a==b returns true.(behaves like string pool) two references points to same object since values are same na!
        System.out.println(z);
        System.out.println(x == z); //true
        System.out.println(a == b); //false -->because it is comparing the refernces not the values itself
        System.out.println(a.equals(b));//always ue this
        System.out.println(Integer.max(a ,b));
    }
}
