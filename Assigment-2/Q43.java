 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int slantheight,height;
        double radius;
        slantheight=sc.nextInt();
        height=sc.nextInt();
        radius=Math.sqrt(((slantheight*slantheight)-(height*height)));
        System.out.println(radius);

        double surfacearea=3.14*radius*radius;
        System.out.println(surfacearea);
         double totalCost=surfacearea*10;
         System.out.println(totalCost);
    }
}