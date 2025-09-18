// 29) 1	11	111	1111 11111	……
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int count=1;
        while(count <=5)
        {
            System.out.print(i+" ");
            i=i*10+1;
            count++;
           
        }
    }
}