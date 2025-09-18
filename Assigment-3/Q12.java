// 12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895 import java.util.Scanner;
class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>9999 || a<999)
        {
            System.out.println("the no you entered is out of bound");  
        }
        else
        {
            int temp=a%10;
             System.out.print(temp);
            a=a/10;
           
           temp=a%10;
           System.out.print(temp);
            a=a/10;
            
            temp=a%10;
            System.out.print(temp);
            a=a/10;

            temp=a%10;
            System.out.print(temp);
             }
        
    }

}