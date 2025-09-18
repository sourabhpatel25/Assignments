//Q.6 Sort the array of 0s , 1s and 2s.
 import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

      System.out.println("Enter size of array");
      int n= sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter array elements");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int low=0 , mid =0, high=-1;

      while(mid<=high){
        if(arr[mid]==0){
       int temp=arr[low];
       arr[low]=arr [mid];
       arr[mid]=temp;
       low++;
       mid++;

        }
        else if(arr [mid]==1){
          mid++;
        }
        else{
            int temp=arr[mid];
       arr[mid]=arr [high];
       arr[high]=temp;
       high--;
        }
        }
          System.out.println("sorted arry");
          System.out.println(Arrays.toString(arr));

   }
}

      
      