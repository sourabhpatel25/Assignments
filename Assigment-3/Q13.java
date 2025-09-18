// 13. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday
import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a<1 || a>7)
        {
            System.out.println("no is out of bound");
        }
        else if(a==1)
        {
            System.out.println("Monday");
        }
        else if(a==2)
        {
            System.out.println("tuesday");
        }
        else if(a==3)
        {
            System.out.println("wednesday");
        }
        else if(a==4)
        {
            System.out.println("thrusday");
        }
        else if(a==5)
        {
            System.out.println("friday");
        }
        else if(a==6)
        {
            System.out.println("saturday");
        }
        else if(a==7)
        {
            System.out.println("sunday");
        }
        
        

    
        
    }

}