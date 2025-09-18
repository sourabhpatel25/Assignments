 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int areafloor,areatile;
         int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();


        areafloor=length*breadth;
         int tilelength,tilebreadth;
        tilelength=sc.nextInt();
        tilebreadth=sc.nextInt();
        areatile=tilelength*tilebreadth;
        int totalTileRequired=areafloor/areatile;
        System.out.println(totalTileRequired);
    }
}