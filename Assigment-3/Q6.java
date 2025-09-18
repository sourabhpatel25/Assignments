/*6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
*/
import java.util.Scanner;

class Test{
public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        //absolute value
        if(number>0){
            System.out.println(number);
        }else if(number<0){
            System.out.println(-number);
        }
        }
}
