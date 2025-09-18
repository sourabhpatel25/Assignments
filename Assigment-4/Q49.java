// WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;

       class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start end : ");
        int start = sc.nextInt();

        System.out.print("Enter  end  number : ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num && num != 0) {
                System.out.println(num);
            }
        }
    }
}
