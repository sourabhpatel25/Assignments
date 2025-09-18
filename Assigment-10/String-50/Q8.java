
//8. Write a Java program to test if a given string contains the specified sequence of char values .
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String-1 =");
        String s1=sc.next();
        System.out.print("Enter String-2 =");
        String s2=sc.next();
        int len=s2.length();

     for(int i=0; i<=s1.length()-len; i++){
        String str = s1.substring(i, len+i);
        if(s2.equals(str)) {
            System.out.println("contains");
            break;
        }      
    } 

    // System.out.println(s1.substring(0,4));
    }
}