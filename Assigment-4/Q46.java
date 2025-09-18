// WAP to find out the sum of first and last digit of a user entered number 
import java.util.Scanner;


      class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = sc.nextInt();
        int original = num;
        int lastDigit = num%10;
        while (num >= 10) {
            num = num / 10;
        }
        int firstDigit = num;
        int sum = firstDigit + lastDigit;
        System.out.println("Number: " + original);
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("First aur Last digit ka sum: " + sum);
    }
}
