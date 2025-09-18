 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int areaGarden,areaPool;
         int sidesq,sidepo;
        sidesq=sc.nextInt();
        sidepo=sc.nextInt();
        areaPool=sidepo*sidepo;
        areaGarden=(sidesq*sidesq)-areaPool;
        System.out.println(areaGarden);

    }
}