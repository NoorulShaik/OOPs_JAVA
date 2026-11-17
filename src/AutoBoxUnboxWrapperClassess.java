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
        System.out.println(z);
    }
}
