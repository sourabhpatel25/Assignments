
// 19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        double sum=0;
        int i=1;
        while(i<=n)
        {
            sum=sum+(1.0/i);
            System.out.println(sum);
            i++;
        }
    }
}