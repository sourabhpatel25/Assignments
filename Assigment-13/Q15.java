// 5. ATM PIN Validation

// If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException.

// Which exception handling mechanism will you use?

// Should it be checked (force the programmer to handle) or unchecked?
 import java.util.Scanner;
class AccountLockedException extends Exception{
      public AccountLockedException(String msg){
        super(msg);
      }
}

class ATMSystem{
   public static final int CorrectPin = 1234;
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int attempts=0;

    while(true){
        try{
            System.out.println("Enter PIN");
            int pin=sc.nextInt();
            if(pin==CorrectPin){
                System.out.println("Access Granted");
                break;
            }else{
                attempts++;
                System.out.println("Wrong Pin.....Attempts left" + (3-attempts));
                if(attempts==3){
                    throw new AccountLockedException("Account locked due to 3 wrong attemps");
                }
            }
        }catch(AccountLockedException e){
            System.out.println("Not" + e);
            break;
        }
    }
    sc.close();
  }   
}