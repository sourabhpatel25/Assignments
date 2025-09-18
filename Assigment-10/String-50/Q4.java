// . Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string-1 =");
        String s1=sc.next();
        System.out.print("Enter string-2 =");
        String s2=sc.next();
        int i=0;
        if(s1.length()!=s2.length())System.out.println("Both String are not equal");
        else{
            for(i=0;i<s1.length();i++){
             if(s1.charAt(i)!=s2.charAt(i)){
                break;
             }
            }
            if(i< s1.length())System.out.println("Both strings are not equal");
            else System.out.println("Both String are equal");
        }
      }
    }