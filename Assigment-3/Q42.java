// Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
//Basic Salary <= 20000 : HRA = 25%, DA = 90% 
//Basic Salary > 20000 : HRA = 30%, DA = 95% 

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter employees basic salary:");
        int salary = sc.nextInt();
        float da, hra;    
        if(salary <= 10000){
            da = salary * 0.2f;
            hra = salary * 0.8f;
        }
        else if(salary > 10000 && salary <= 20000){
            da = salary * 0.25f;
            hra = salary * 0.9f;
        }
        else{
            da = salary * 0.3f;
            hra = salary * 0.95f;
        }
        float gross_salary = salary + da + hra;
        System.out.println("Gross salary of employee is "+ gross_salary);
    }
}