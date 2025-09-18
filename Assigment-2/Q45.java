 // 45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .

import java.util.Scanner;
   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // 45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
        int sn;
        System.out.println("enter the first term");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the second term");
        int d=b-a;
        sn=28/2*(2*(-21)+27*d);
        System.out.println(sn);
    }
}