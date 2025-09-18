//18. Write a java program to get the length of a given string
import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.nextLine();

        int s2=s1.length();
        System.out.println("String length is :"+s2);
    }
}