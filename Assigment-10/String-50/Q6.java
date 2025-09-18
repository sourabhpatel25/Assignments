//7. Write a Java program to concatenate a given string to the end of another string    
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string-1 =");
        String s1=sc.next();
        System.out.print("Enter string-2 =");
        String s2=sc.next();
        
        String result=s1.concat(s2);
        System.out.println("Concatenated string is =" +result);

    }
}