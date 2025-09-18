// 14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R
import java.util.Scanner;
class  MathOperation{
    private int x;
    private int y;
    private int r;
    public void init(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x= ");
        x=sc.nextInt();
         System.out.print("enter the value of y= ");
        y=sc.nextInt();

    }
    public void add(){
        r=x+y;
    }
    public void multiply(){
        r=x*y;
    }
    public void power(){
        r=1;
        for(int i=1;i<=y;i++){
            r=r*x;
        }
    }


    public void display(){
        System.out.println("result="+r);
    }
}
class Test{
    public static void  main(String args[]){
  MathOperation m=new MathOperation();
  m.init();
  m.add();
  m.display();
  m.multiply();
  m.display();
  m.power();
  m.display();
}


}