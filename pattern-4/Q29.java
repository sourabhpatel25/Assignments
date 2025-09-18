/*
a
bc
d f
g  j
klmno	

*/
class Test{
    public static void main(String args[]){
        
        char ch='a';
        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
               if(j==1||j==i||i==5){
               System.out.print(ch);
               ch++;
               }
               else{
               System.out.print(" ");
               }
               
            }
            System.out.println();
            
            
        }
    }
}