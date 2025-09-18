//WAP to search an element in array using binary search 
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
        System.out.println("enter the values");
        arr[i] = sc.nextInt();}

        System.out.println("enter  the element you can search");
        int search = sc.nextInt();

        int low=0, high = size-1;

        while  (low<=high){
            int mid = (low+high) / 2;

            if(arr[mid] == search)
            break;
                
             else if (arr[mid]<search){
                low = mid +1;
            } else 
                high = mid-1;
                
        }  if(low>high)
        System.out.println("Element not found ");
        else 
        System.out.println("element found");
}
}

