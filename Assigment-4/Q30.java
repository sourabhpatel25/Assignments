// 30) 1+11+111+1111+11111+…. 
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int a=0;
        int sum=0;
        for (int i=1;i<=n;i++){
            a=a*10+1;
            sum+=a;
        }
         System.out.println(sum+" ");  
        }
    }