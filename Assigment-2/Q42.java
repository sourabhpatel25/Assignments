 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double vol;
        double diameter=sc.nextDouble();
        double height=sc.nextDouble();
        double radius=diameter/2;
        vol=3.14*radius*radius*height;
        System.out.println(vol);
    }
}