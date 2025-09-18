 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int volCube,volCuboid;
        int lc,bc,hc,ssq;
           System.out.println("enter the length");
        lc=sc.nextInt();
           System.out.println("enter the breadth");
        bc=sc.nextInt();
           System.out.println("enter the hight");
        hc=sc.nextInt();
        System.out.println("enter the length of the sides of cube");
        ssq=sc.nextInt();
        //   
        int volCube=ssq*ssq*ssq;
         int volCuboid=lc*bc*hc;
        if(volCube>volCuboid)
        {
            System.out.println("cube is having the large voume");
        }
        else{
            System.out.println("cuboid is having the large voume");

        }
    }
}