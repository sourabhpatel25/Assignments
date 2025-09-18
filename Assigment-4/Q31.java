//31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    int i =1;
    int num=9;
    while(i<=n){
    System.out.println(num+" ");
    num=num*10+9;
    i++;
}
}
}