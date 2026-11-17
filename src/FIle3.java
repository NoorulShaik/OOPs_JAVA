public class FIle3 {
    /*
    In this file will see the call by value and call by reference( Hey there is no call by reference in java ).
    We pass the copy of reference variable.
     */
    public static void main(String[] args) {
//         int x = 6;
//         int y = 7;
//        System.out.println(x+ " , " + y);
//        swap(x,y);
//        System.out.println(x+ " , " + y);
        Swap sp = new Swap(6,7);
        Swap sp3 = sp; //Example of Shallow copy..same object
        Swap sp2 = new Swap(sp); // Different objects are created and then copied values Example of Deep copy --passing reference variable to constructor --copy constructor.
        System.out.println(sp.x +" , " + sp.y);
        swapp(sp2);
        System.out.println(sp2.x +" , " + sp2.y);

    }
    static void swap(int x , int y){
        int temp = x;
        x = y;
        y = temp;
        //Ofcourse this will not work ,you are stupid if you do this.
        //THis effect will only last locally.

    }
    static void swapp(Swap s){
        int temp = s.x;
        s.x = s.y;
        s.y  = temp;
    }
}
class Swap{
        int x;
        int y;

        public Swap(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Swap(Swap sp){
            this.x = sp.x; //This is copy constructor bro!!
            this.y = sp.y;
        }
}
