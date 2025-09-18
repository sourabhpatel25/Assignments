// WAP to check given year is a leap year or not/ 
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if(year % 100 == 0){

            if(year % 400 == 0)
            System.out.println("Given year is a leap year.");
            else System.out.println("Given year is not a leap year.");

        }else if(year % 4 == 0){
            System.out.println("Given year is a leap year.");
        } else {
            System.out.println("Given year is not a leap year.");
      }
    }}
