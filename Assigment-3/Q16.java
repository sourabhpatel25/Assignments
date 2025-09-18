 // 1. WAP to calculate area of circle
 import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your radius");
        int radius=sc.nextInt();
        float area=3.14f*radius*radius;
        System.out.println("Area:"+area);   
    }}