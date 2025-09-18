
//*****
import java.util.Scanner;

class Test{
    public static void main(String args[]){
     System.out.println("Enter number");
     Scanner sc= new Scanner(System.in);
     int n =sc.nextInt();
        for(int star= 1; star<=n; star++){
            System.out.print("*");
        }
    }
}