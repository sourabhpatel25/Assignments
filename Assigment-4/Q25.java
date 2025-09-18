// 25) 1	27	125	343	…………
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i*i*i);
            i+=2;
        }
    }
}