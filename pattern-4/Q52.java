/*
A
AB
A_C
A__D
ABCDE
*/

class Test{
    public static void main(String args[]){
     
        for (int line=1; line<=5; line++){
            for(int space = 0; space<5-line ; space++){
             System.out.print(" ");
            }    
            char ch='A';
            for (int j=1; j<=line; j++){
                if(line==j || line==5 || j==1)    System.out.print(ch);
                else System.out.print("_");
                ch++;
            }
            System.out.println();
        }
    }
}