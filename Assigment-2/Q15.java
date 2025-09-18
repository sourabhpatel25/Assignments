import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int lr,br,fg;
           System.out.println("enter the shelly garden leghth");
        lr=sc.nextInt();
           System.out.println("enter the shelly garden breath");
        br=sc.nextInt();
           System.out.println("enter the rachel garden length");
        fg=sc.nextInt();
        
        int areaShelly=lr*br;
        int areaRachel=fg*fg;
        if(areaShelly>areaRachel)
        {
            System.out.println("shelly garden in bigger than her friend rahcel by "+(areaShelly-areaRachel));

        }
        else{
            System.out.println("rahcel garden in bigger than her friend shelly by "+(areaRachel-areaShelly));

        }
    }
}