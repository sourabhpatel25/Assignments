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
         int lengthTile;
        lengthTile=sc.nextInt();
        
        areatile=lengthTile*lengthTile;
        int totalTileRequired=areafloor/areatile;
        System.out.println(totalTileRequired);
    }
}