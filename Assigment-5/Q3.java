//WAP to program calaculate the sum of all even element and all odd element of array
 import java.util.Scanner;
 class Test{
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of element");
  int n=sc.nextInt();
  int[] arr=new int[n];
  int evenSum=0, oodSum=0;
  System.out.println("Enter the elements of array");
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    if(arr[i]%2==0){
        evenSum+=arr[i];
    }else{
        oodSum+=arr[i];
    }

  }
  System.out.println("Even elements sum"+evenSum);
    System.out.println("ood elements sum"+oodSum);

    }
 }