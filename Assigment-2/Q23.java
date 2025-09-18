 import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int volCube,volCartoon;
          System.out.println("enter the length of cartoon");
        int lc=sc.nextInt();
           System.out.println("enter the breadth of cratoon");
        int bc=sc.nextInt();
           System.out.println("enter the hight of cartoon");
        int hc=sc.nextInt();
          System.out.println("enter the length of cube");
        int lcube=sc.nextInt();
        //   
        volCube=lcube*lcube*lcube;
        volCartoon=hc*bc*lc;
        float totalCube=volCartoon/volCube;
        System.out.println(totalCube);
    }
}