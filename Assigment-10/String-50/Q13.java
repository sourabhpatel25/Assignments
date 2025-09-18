//. Write a Java program to create a character array containing the contents of a string.
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.prinln("Enter a String :");
        String s1=sc.next();
       
       char charArray[]= new char [s1.length()];

       for(int i=0;i<s1.length();i++){
        charArray[i]=s1.charAt(i);
       }
       System.out.prinln("Character array contents");
       for(int i=0;i<charArray.length;i++){
            System.out.prinln(charArray[i]+" ");
       } 
    }
}
