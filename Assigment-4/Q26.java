// 26) 0	8	64	216	…………
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<=n)
        {
            System.out.println(i*i*i);
            i+=2;
        }
    }
}