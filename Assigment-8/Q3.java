/*
Bank Account
Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance.
*/
class BankAccount{
    private double accountNumber ;
    private String  holderName;
    private double balance;
    public void setvalue(double accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    

}
public double setaccountNumber(){
    return accountNumber;
}
public String setholderName(){
    return holderName;
}
public double setbalance(){
    return balance;
}
public void BalanceDetails(){
    System.out.println("Account Number    : " + accountNumber);
     System.out.println("Holder Namme     : " + holderName);
    System.out.println("Balance           : ₹" + balance);

}
}

class TestMain{
    public static void main(String args[]){
      BankAccount obj =new BankAccount();
     obj.setvalue(123457,"Sourabh Patel",45000000);
     obj.BalanceDetails();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getaccountNumber());
        //System.out.println(obj.getholderName());
       // System.out.println(obj.getbalance());
    }
    
}