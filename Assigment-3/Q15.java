// 15. Write a java program to accept the cost price of a bike
//     and display the road tax to be paid according to the 
//     following criteria.
//     Cost Price(In Rs)		Tax
//      > 100000			 15%
//      >50000 and <=100000	 10%
//      <=50000			 5%		

import java.util.Scanner;

class Test{
    
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Cost price of bike");
        int costPrice=sc.nextInt();
        float  tax=0;
        
        if(costPrice>100000)
        {
            tax=(costPrice/100)*15;
        }
        else if(costPrice>50000 && costPrice<=100000)
        {
             tax=(costPrice/100)*10;

        }
        else if(costPrice<=50000)
        {
             tax=(costPrice/100)*5;
        }
        float total=costPrice+tax;
        System.out.println(total);  
    }

}