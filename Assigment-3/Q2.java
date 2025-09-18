//2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity
//Suppose, one unit will cost 100.
//Judge and print total cost for user.

import java.util .Scanner;
class Test{

  public static void main(String args[]){
   Scanner cs = new Scanner(System.in);
 
 System.out.println("Enter quentity");
 int quantity= cs.nextInt();
 int unitPrice=100;
 int totalCost=quantity*unitPrice;

if(totalCost>1000){
    totalCost-=totalCost*0.10;//aplly 10% discount
    System.out.println("Totalcost:"+totalCost);

}


}


}
