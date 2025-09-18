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
  for(int r=0;r<m;r++){
    for(int c=0;c<n;c++){
      
        if(arr[r][c]%2==0){
            evenSum += arr[r][c];
        
        }else{
            oodSum += arr[r][c];
        }
    }
  }
    System.out.println("Sum of EVEN numbers ="+ evenSum);
        System.out.println("Sum of OOD numbers ="+  oodSum);

  
}
}
