// Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers:");
        int a = sc.nextInt();
         System.out.println("Enter 2nd  numbers:");
        int b = sc.nextInt();
        System.out.println("Enter choices(+,>,==):");
        String input = sc.nextLine();
        switch(input){
            case "+":
                System.out.println("Result of sum: "+ (a+b));
                break;
            case ">":
                System.out.println("Result of greater than check: "+ (a>b));
                break;
            case "==":
                System.out.println("Result of equality check: "+ (a==b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}