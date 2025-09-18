// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  sides 1 measure:");
        int side1 = sc.nextInt();
        System.out.println("Enter sides 2 measure:");
        int side2 = sc.nextInt();
        System.out.println("Enter sides 3 measure:");
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Given triangle is equilateral.");
        }
        else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("Given triangle is isosceles.");
        } else 
            System.out.println("Given triangle is scalen.");

    }
}