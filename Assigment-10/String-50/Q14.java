//16. Write a Java program to convert all the characters in a string to Lowercase

import java.util.Scanner;
class Test{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String");
       String s1=sc.nextLine();
       
       String s2= s1.toLowerCase();

       System.out.println("Lowercase String :"+s2);
    }
}
