//12. Write a Java program to check whether two String objects contain the same data.

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1st:");
        String s1=sc.next();
        System.out.println("Enter String 2nd:");
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("String contain same data");
        }else{
            System.out.println("String conatin not same data");
        }
    }
}