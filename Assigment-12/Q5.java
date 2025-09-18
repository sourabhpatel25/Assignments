// Problem 4: Banking System 

// Abstract class BankAccount:

// accountNumber, balance fields

// abstract methods: deposit(), withdraw()

// concrete method showBalance()

// Subclasses:

// SavingsAccount (cannot withdraw below ₹1000)

// CurrentAccount (no min balance required)

// Interface LoanEligible with method checkLoanEligibility().

// Only SavingsAccount is loan eligible.
abstract class BankAccount {
    private int acno;
     double balance;
   public BankAccount(int acno,double balance){
    this.acno=acno;
    this.balance=balance;
   }
   abstract public void deposit(double deposit);
   abstract public void withdraw(double withdraw);
   public void showbalance(){
    System.out.println("account number  "+acno+" balance is  ="+balance);
   }
    
}
interface LoanEligible{
    void checkLoanEligibility();
}
class SavingAccount extends BankAccount implements LoanEligible{
//  private double withdraw;
//  private double deposit;

 public SavingAccount(int acno,double balance){
    super(acno, balance);
    // this.withdraw=withdraw;
    // this.deposit=deposit;
 }
 public void deposit(double deposit){
    // this.deposit=deposit;
    this.balance+=deposit;
 }
 public void withdraw(double withdraw){
    // this.withdraw=withdraw;
    if(withdraw<1000){
        System.out.println("you can not withdraw below 1000");

    }else{
        
        this.balance-=withdraw;
    }
 }
 public void checkLoanEligibility(){
    System.out.println("your are eligible for loan..");
 }


}
class CurrentAccount extends BankAccount{
    public CurrentAccount(int acno,double balance){
      super(acno, balance);

    }
   public void deposit(double deposit){
    // this.deposit=deposit;
    this.balance+=deposit;
 }
 public void withdraw(double withdraw){
    // this.withdraw=withdraw;
     this.balance-=withdraw;
    
 }
}
class Test{
    public static void main(String args[]){
        SavingAccount b=new SavingAccount(101, 10000);
        b.showbalance();
        b.deposit(200);
         b.showbalance();
        b.withdraw(400);
         b.showbalance();
         b.checkLoanEligibility();
         CurrentAccount c=new CurrentAccount(102,30000);
          c.showbalance();
        c.deposit(200);
         c.showbalance();
        c.withdraw(2000);
         c.showbalance();
    }
}