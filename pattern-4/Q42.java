/*
55555
4  4
3 3
22
1
*/

class Test{
    public static void main(String args[]){
        
        int n=5;
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
               if(j==1||i==n||i==j){
               System.out.print(i);
               }
               else{
               System.out.print(" ");
               }
               
            }
            System.out.println();
            
            
        }
    }
}