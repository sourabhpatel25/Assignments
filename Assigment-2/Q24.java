import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         double wallVolume,brickvol;

          System.out.println("enter the length of the brick");
        int bl=sc.nextInt();
           System.out.println("enter the breadth of the brick");
       int bb=sc.nextInt();
           System.out.println("enter the hight of the brick");
        double bh=sc.nextDouble(); 
         System.out.println("enter the length of the wall ");
        int wl=sc.nextInt();
           System.out.println("enter the breadth of the wall ");
        int wb=sc.nextInt();
           System.out.println("enter the hight of the wall ");
        int wh=sc.nextInt();
        



        brickvol=bl*bb*bh;
        wallVolume=wl*wb*wh;
        double totalBrickRequired=wallVolume/brickvol;
        double totalCost=(totalBrickRequired/1000)*900;
        System.out.println(totalCost);
        System.out.println(totalBrickRequired);
    }
}