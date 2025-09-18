//WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num =sc.nextInt();
    int evenCount=0;
    int  oddCount =0;
    while (num>0){
        int digit=num %10;
        if (digit%2==0){
            evenCount++;

        } else{
        oddCount++;
        }
        num=num/10;
    }
    System.out.println("Even digit are:"+evenCount);
    System.out.println("Ood digit are : "+oddCount);
    }
}