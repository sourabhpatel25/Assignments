//17. Write a Java program to convert all the characters in a string to Uppercas
import java.util.Scanner;
 class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.nextLine();

        String s2=s1.toUpperCase();
        System.out.println("Uppercase String :"+s2);
    }
 }