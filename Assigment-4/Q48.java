// WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int start=sc.nextInt();
        System.out.println("Enter end number");
        int end=sc.nextInt();
        for(int num=start; num<=end;num++){
            System.out.println("Factores of "+num+"are");
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");

                }
            }
            System.out.println();
        }
    }
}