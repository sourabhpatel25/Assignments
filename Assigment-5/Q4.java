//WAP to find an element in array.import java.util.Scanner;
class Test{
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        int arr[]= {10, 20, 30, 40, 50};

     System.out.println("enter the element you have found");
     int  n= sc.nextInt();

        int i;

    for (i=0; i<arr.length;  i++){
        if (arr[i]==n)
        break;
        }
        if (i<arr.length)
            System.out.println("element found");
        else
       System.out.println("not found");
}
}
