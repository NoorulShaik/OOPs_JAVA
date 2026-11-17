public class Encapsulation {
    /*
    Encapsulation
Wrapping data (fields) and behavior (methods) into a single unit,
and hiding the internal state(un-authorised access using Access Modifiers) from the outside world — you only expose controlled doors in (getters/setters) and out.

Analogy
A capsule medicine. The drug (data) is wrapped inside so you can't touch it directly — you just swallow the capsule (call a method).
What's inside can change formulation without you ever knowing.
    Example:
public class BankAccount {
    private double balance; // hidden

    public double getBalance() { return balance; }
    public void deposit(double amt) {
        if (amt > 0) balance += amt; // controlled entry point
    }
}

Without encapsulation, anyone could do account.balance = -5000 directly.
 The private + getter/setter pattern is what prevents that.

     AccessModifers:
     private ---> class level ,Only accessed within the class .
     default ---> Anyone can access belonging to same package.
     protected ----> Anyone can access same package and its Inherited class(child class).
     public --->AnyOne can access from anywhere.
     */
    public static void main(String[] args) {
    BankAccount bk = new BankAccount(100);
        System.out.println(bk.getBalance());
        bk.deposit(500);
        bk.withdraw(400);
        System.out.println(bk.getBalance());
    //bk.balance = 100000.0; can't access.
      //  System.out.println(bk.balance);
    }
}
class BankAccount{
   private double balance;
   BankAccount(double balance){
       this.balance = balance;
   }
   public void deposit(double amount){
       balance += amount;
   }
   public void withdraw(double amount){
       balance -= amount;
   }
   public double getBalance(){
       return balance;
   }
   //all the above methods are called getters and setters.
}