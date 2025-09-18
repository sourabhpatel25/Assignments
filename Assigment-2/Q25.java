import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int areaBrick,surfaceArea;
        int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        
        areaBrick=length*breadth;
        surfaceArea=areaBrick*100;
        System.out.println(surfaceArea);
    }
}