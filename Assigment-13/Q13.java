// 3. Online Exam System

// A student enters their roll number (integer), but by mistake they enter "abc".

// Which exception will occur?

// How can you catch it and ask them to re-enter?

// Can you use a loop to keep asking until they enter valid input?

import java.util.Scanner;
import java.util.InputMismatchException;

class OnlineExamSystem{

    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int rollNumber = 0;
        boolean valid = false;
       
       while(!valid){
        try{
        System.out.println("Enter your Roll Number");
        rollNumber=sc.nextInt();
        valid=true;
       }catch(InputMismatchException e){
        System.out.println("Invalid Rollnumber please enter a number only");
        sc.nextLine();
       }

    }
    System.out.println("Roll Number Accepted:"+ rollNumber);
    sc.close();
  }
}