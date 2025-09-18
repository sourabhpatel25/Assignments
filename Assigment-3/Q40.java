//Write a Java program to calculate profit or loss.
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int costPrice = sc.nextInt();
        System.out.println("Enter sell price: ");
        int sellPrice = sc.nextInt();
        if(costPrice > sellPrice){
            int loss = costPrice - sellPrice;
            System.out.println("Loss of "+ loss);
        } else if(costPrice==sellPrice){
            System.out.println("no  profit no loss");
        }
        else {
            int profit = sellPrice - costPrice;
            System.out.println("Loss of "+ profit);
        }
    }
}