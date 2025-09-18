// 1. Banking System - Insufficient Balance

// You are building a banking system. A user tries to withdraw more money than available in their account.

// Which exception would you throw?

// Will you use a checked or unchecked exception? Why?

// Write a custom exception InsufficientBalanceException.
 
 class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
 }
 class BankAccount{
    private int balance;

    public BankAccount(int initialBalance){
        this.balance=initialBalance;
    }
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance available:" +balance);
        }
        balance-=amount;
        System.out.println("Withdrawl successful:  Reamaning balance"+ balance);
    }
    public int getBalance(){
        return balance;
    }
 }

 class Main{
    public static void main (String args[]){
        BankAccount account=new BankAccount(5000);
        try{
            account.withdraw(7000);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Exception caught:" +e);
        }
    }
 }