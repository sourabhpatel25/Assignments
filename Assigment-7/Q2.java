import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the order of matrix");
    int m=sc.nextInt();
   int n=sc.nextInt();
  int arr[][]=new int [m][n];
  for(int r=0;r<m;r++){
  System.out.println("Enter"+n+"element of "+(r+1)+"row");
  for(int c=0;c<n;c++){
    arr[r][c]=sc.nextInt();
  
  }
  }
   for(int r=0;r<m;r++){
     for(int c=0;c<n;c++){
        if(r==0&&c==2||r==1&&c==1||r==2&&c==0)
          System.out.print(arr[r][c]+" ");
   }
  }
  } 
}