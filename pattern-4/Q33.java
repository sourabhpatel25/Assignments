/*
1
10
1 1
1  0
10101
*/

class Test{
    public static void main(String args[]){
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
               if(i==3&&j==2){
               System.out.print(" ");
               }
               else if(i==4&&j==2){
                System.out.print(" ");
               }
               else if((i+j)%2==0){
                      System.out.print("1");
                }
               else{
               System.out.print("0");
               }
            }
            System.out.println();
            
        }
    }
}