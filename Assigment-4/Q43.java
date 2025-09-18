// WAP to convert binary number into decimal number
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        int originalBinary = binary;

        
        while (binary != 0) {
            int digit = binary % 10;          
            decimal = decimal + digit * (int)Math.pow(2, power); 
            power++;                          
            binary = binary / 10;          
        }
        
        System.out.println("Binary number " + originalBinary + " Decimal " + decimal);
    }
}
