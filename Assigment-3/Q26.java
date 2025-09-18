// Find even odd using switch case 
import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        switch (a%2) {
    case 1:
      System.out.println("the no you entered is odd");
        break;
    case 0:
        System.out.println("the no you entered is even ");
        break;
    default:
        
        break;}}

}