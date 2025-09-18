 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int areaBrick;
         int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        areaBrick=length*breadth;

         int pathlength,pathbreadth;
        pathlength=sc.nextInt();
        pathbreadth=sc.nextInt();
        int surfaceArea=pathlength*pathbreadth;
        int totalBrickRequired=surfaceArea/areaBrick;
        System.out.println(totalBrickRequired);
    }
}