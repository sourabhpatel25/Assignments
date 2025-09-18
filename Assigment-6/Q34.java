//34. Write a java program to implement linear search
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter array element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search element");
        int key=sc.nextInt();

        int pos=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                pos-i;
                break;
            }
        }
        if(pos!=-1){
            System.out.print("Eelement found at index :"+pos);
        }else
        System.out.print("Element not found");
    }
}