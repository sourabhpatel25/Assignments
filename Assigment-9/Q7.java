/*
7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money.
 Also define a class called "Account" to maintain account details of a particular customer.
*/

import java.util.ArrayList;
class Bank{
    ArrayList<Account> al= new ArrayList<Account>();
    public void addAccount(Account account){
        al.add(account);
    }
    public void removeAccount(Account account){
        al.remove(account);
    }
     public void displayAccountDetails(){
      for(Account account :al){
        System.out.println(account.displayFullAccountDetails());
      }
     }
     }
class Account{

    private String holderName;
    private String contact;
    private int balance;

   public Account (String holderName,String contact,int balance ){
    this.holderName=holderName;
    this.contact=contact;
    this.balance=balance;
   }
   public Account(){
   }
    
   
   public String displayFullAccountDetails(){
        return holderName+":"+contact+":"+balance;
    }
}
   class TestMain{
    public static void main(String args[]){
        Account ac1=new Account("sourabh","6264682001",200200);
        Account ac2=new Account("Pawan","62646828801",20000);
        Account ac3=new Account("Arushi","6264677001",200200);
        Account ac4=new Account("Tanu","6264688801",200000);
        Account ac5=new Account("Tarun","6264699001",2200);
      System.out.println("-----------WelCome Sir-----------");
        Bank Boi=new Bank();
       Boi.addAccount(ac1);
       Boi.addAccount(ac2);
       Boi.addAccount(ac3);
       Boi.addAccount(ac4);
       Boi.addAccount(ac5);
       //Boi.removeAccount(ac5);
       Boi.displayAccountDetails();

    }
   }
