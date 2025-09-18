class Test{
    public static void main(String args[]){

        for (int line=1; line<=5-1; line++){
            for(int space = 0; space<5-line ; space++){
             System.out.print(" ");
            }
            for (int j=1; j<=line; j++){
                if(line==j || j==1)    System.out.print(1);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}