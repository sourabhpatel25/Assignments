// 7. Custom Exception

// 👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.

// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// }


// Test in main:

// if(age < 18) throw new InvalidAgeException("Not eligible for voting");
import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class TestMain{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
           System.out.println("Enter Your age: ");
           int age=sc.nextInt();

           if(age < 18){
            throw new InvalidAgeException("Not eligible for voting");
           }
           else{
            System.out.println("Your are eligible");
           }
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
}
