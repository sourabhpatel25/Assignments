//33. Write a java program to impelment binary search algorithm
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter search element");
        int key=sc.nextInt();

        int start=0;
        int end=size-1;
        int pos=-1;

        while(start<end){
            int mid= (start+end)/2; //divided into 2 parts.
            if(arr[mid]==key){
                pos=mid;
                break;
            }
            
            else if (arr[mid] < key) {
                start = mid + 1; // Right half
            } 
            else {
                end = mid - 1; // Left half
            }
        }

            if(pos!= -1){
            System.out.println("Element found at index: " + pos);
        } else {
            System.out.println("Element not found");
        }
            
        }
}