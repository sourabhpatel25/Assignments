import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double vol;
         int radius=sc.nextInt();
        int height=sc.nextInt();
        
        vol=3.14*radius*radius*height;
        System.out.println(vol);
    }
}