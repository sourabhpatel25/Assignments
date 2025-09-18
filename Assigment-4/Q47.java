// WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1<=n2)
        {
            int i =1;
            while(i<=10)
            {
                System.out.print(n1*i+ " ");
                i++;
            }
            System.out.println("\n");
            n1++;
        }
        }
}