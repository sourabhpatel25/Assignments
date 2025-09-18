 // 2. WAP to calculate area of rectangle.
 import java.util.Scanner;

class Test{
   
    
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("Area:"+area);
        }

}