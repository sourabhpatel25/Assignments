 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int walkwayarea;
        int baseo=sc.nextInt();
        int baset=sc.nextInt();
        int height=sc.nextInt();
        double totlarea=0.5*(baseo+baset)*height;
        int walkwaybreadth=sc.nextInt();

         walkwayarea=walkwaybreadth*height;
        double areawow=totlarea-walkwayarea;
        System.out.println(areawow);
    }
}