//13. Write a Java program to get the contents of a given string as a byte array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1=sc.next();
        byte byteArray[]=s1.getByte();
        System.out.prinln("Byte array contents");
        for(int i=0;i<byteArray.length;i++){
            System.out.prinln(byteArray[i]+" ");
        }
    }
}