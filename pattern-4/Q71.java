class Test{
    public static void main(String args[]){
        char ch='A';
        for (int line=1; line<=5; line++){
            for(int space = 1; space<=5-line ; space++){
             System.out.print(" ");
            }
            
            for (int j=1; j<=line*2-1; j++){
                if(j==(2*line-1) || line==5 || j==1)    System.out.print(ch);
                else System.out.print(" ");
         
            }
            System.out.println();
            ch++;
        }
    }
}