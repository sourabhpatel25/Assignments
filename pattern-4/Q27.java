/*
*       *
  *   *
    *
   *   *
  *       * 
*/
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){     
                if((i==j)||(j+i==6)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            
            }
            System.out.println();
        }
    }
}