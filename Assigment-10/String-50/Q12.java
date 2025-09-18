//14. Write a Java program to get the canonical representation of the string object
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1st");
        String str1=sc.next();
        System.out.println("Entet String 2nd");
        String str2=sc.next();
        
        String s1=str1.intern();
        String s2=str2.intern();

        if(s1==s2){
            System.out.println("Both String have same canonical representation ");
        }else{
            System.out.println("Bothe String have not same cononical representaion");
        }

    }
}