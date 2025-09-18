// 🔹 Problem Set on Abstract Class, Inheritance & Interface
// Problem 1: Payment Gateway System 

// Create an abstract class Payment with:

// amount field

// abstract method pay()

// concrete method paymentDetails()

// Subclasses:

// CreditCardPayment

// DebitCardPayment

// UPIPayment

// Create an interface Refundable with processRefund() method.

// Only CreditCardPayment and UPIPayment should implement Refundable.

// In main class, create different payments and process refund where applicable.  
import java.util.Scanner;
abstract class Payment{

    private int amount;

    public Payment(int amount){
        this.amount=amount;

    }
    abstract public void toPay();
    //abstract public void toConcrate();

}
interface Refundable{
    
    void processRefund();
   
}
class CreditCardPayment extends Payment implements Refundable{
    // public CreditCardPayment(){}
        public CreditCardPayment(int r){
            super(r);
        }
    public void toPay(){
    System.out.println("Payment by credit card");
    }
    public void processRefund(){
    System.out.println("Refundable by credit card");
    }

}
class DebitCardPaymente extends Payment{
    // public DebitCardPaymente(){}
        public DebitCardPaymente(int r){
            super(r);
        }
    public void toPay(){
        
    System.out.println("Payment by Debit card");
    }

}
class UPIPayment extends Payment implements Refundable{
    // public UPIPayment(){}
        public UPIPayment(int r){
            super(r);
        }
     public void toPay(){
    System.out.println("Payment by UPI");
    }
    public void processRefund(){
        System.out.println("Refundable by UPI");
    }

}

class Main{

    public static void main(String args[]){

        CreditCardPayment c=new CreditCardPayment(6000);
        

        Payment d=new DebitCardPaymente(7000);
          

        UPIPayment u=new UPIPayment(5000);
         
         c.toPay();
         d.toPay();
         u.toPay();
         c.processRefund();
         u.processRefund();


    }

}