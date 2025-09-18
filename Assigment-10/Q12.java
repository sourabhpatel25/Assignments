// Input data exactly in the following format, and print sum of all integer values.
// 	Sample Input: 67, 89, 23, 67, 12, 55, 66. (Hint use String class split method and Integer class parseInt method)
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String =");
        String str=sc.nextLine();
        int len =str.length();
        int sum=0;
        
        String nums[]=str.split(",");

        for(int i=0;i<nums.length;i++){
            int number=Integer.parseInt(nums[i]);
            sum+=number;
        }
        System.out.println("Sum of numbers is ="+sum);
    }

}