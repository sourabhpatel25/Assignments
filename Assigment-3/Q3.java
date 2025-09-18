//3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
 import java.util.Scanner;
 class Test{

public static void main(String args []){
Scanner cs = new Scanner(System.in);

int salary,yos;
       salary=cs.nextInt();
       yos=cs.nextInt();
       if(yos>5)
       {
        int bonus=(salary/100)*5;
        salary=salary+bonus;
        System.out.println(salary);
       }
        else
        System.out.println(salary);
    }

}