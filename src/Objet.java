public class Objet {
    public static void main(String[] args) {
        NoorulShaik ob = new NoorulShaik();
        System.out.println(ob);//println by defualt implements the toString method.
       NoorulShaik ob2 = ob;//new NoorulShaik();
        System.out.println(ob.equals(ob2));

    }
}
class NoorulShaik{
    @Override
    public String toString(){
        return "This is Shaik";
    }
    void shak(){
        System.out.println("How are you doing Shaik");
    }
}
