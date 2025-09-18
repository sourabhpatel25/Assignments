 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         double surfacearea;
        double radius=sc.nextDouble();
        int height=sc.nextInt();
        surfacearea=2*3.14*radius*(radius+height);
        System.out.println(surfacearea);
    }
}