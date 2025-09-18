//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner cs= new Scanner( System.in);
        System.out.println("Enter the value of length");
        int length=cs.nextInt();
        System.out.println("Enter the value of breadth");
        int breadth = cs.nextInt();
        if(length==breadth)
            System.out.println("Square");
            
        else
            System.out.println("Not square");
        }}