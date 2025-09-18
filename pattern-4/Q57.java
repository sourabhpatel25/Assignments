class Test{
    public static void main(String args[]){
     
        for (int line=5; line>=1; line--){
            for(int space = 0; space<5-line ; space++){
             System.out.print(" ");
            }    
            
            for (int j=1; j<=line; j++){
                if(line==j || line==5 || j==1)    System.out.print(line);
                else System.out.print("_");
                
            }
            System.out.println();
        }
    }
}