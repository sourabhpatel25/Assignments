// WAP to interchange first and last digit of a number
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int lastDigit = num % 10;
        
        int digits = 0;
        int temp = num;
        while (temp >= 10) {
            temp /= 10;
            digits++;
        }
        int firstDigit = temp;
        int middle = (num % (int)Math.pow(10, digits)) / 10;
        int newNumber = lastDigit * (int)Math.pow(10, digits) + middle * 10 + firstDigit;

        System.out.println("Number after swapping first and last digits: " + newNumber);
    }
}
