//WAP to check whether entered number is Armstrong or not.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num =sc.nextInt();
    int orginal=num;
    int sum =0;
    while (num>0){
        int digit=num%10;
        sum=sum +(digit*digit*digit);
        num=num/10;
    }
    if(sum==orginal){
        System.out.println("number is Armstrong");
            }else{
                System.out.println("number is not Armstrong");
            }
}
}