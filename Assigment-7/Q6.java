import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the order of matrix");
    int m=sc.nextInt();
   int n=sc.nextInt();
  int arr[][]=new int [m][n];
   int evenSum=0,oodSum=0;
    for(int r=0;r<m;r++){
    System.out.println("Enter"+n+"element of "+(r+1)+"row");
    for(int c=0;c<n;c++){
    arr[r][c]=sc.nextInt();
    
  }
  }
  int maxSum=0;
  int maxRow=0;
  for(int r=0;r<m;r++){
    int sum=0;
    for(int c=0;c<n;c++){
        sum+=arr[r][c];

    }
    if(sum>maxSum){
        maxSum=sum;
        maxRow=sum;
        maxRow=r;
    }
  }
  
  System.out.println("Row has max sum is:");
  for(int c=0;c<n;c++){
  System.out.println(arr[maxRow][c]+" ");
  }
  System.out.print("\nMax sum is :"+maxSum);

}
}
