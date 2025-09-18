/*
******
 *   *
 *   *
 *   *
******
*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6;j++){
                if((i==1)||(i==5)||(j==3)||(j==6))
                System.out.print("*");
                else{
                System.out.print(" ");
            }
        }
           System.out.println();

    }
  }
}