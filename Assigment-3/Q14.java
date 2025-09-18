// 14.Write a program to accept percantage from the user and
// display grade according to the following criteria
//   Marks	  		Grade
//   > 90       		 A
//   >80 and <=90		 B
//   >=60 and <=80		 C
//   below 60		 D
import java.util.Scanner;


class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Percantage");
        int percantage=sc.nextInt();
        char grade='a';
        if(percantage>90)
        {
            grade='A';
        }
        else if(percantage>80 && percantage<=90)
        {
            grade='B';
        }
        else if(percantage>=60 && percantage<=80)
        {
            grade='C';
        }
        else if(percantage<60)
        {
            grade='D';
        }
        System.out.println(grade);

        
        
    }
}