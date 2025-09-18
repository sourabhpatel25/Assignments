/*
1
22
333
4444
55555
*/

class Test{
    public static void main(String args[]){

        for (int line=1; line<=5; line++){
            for(int space = 0; space<5-line ; space++){
             System.out.print(" ");
            }
            for (int j=1; j<=line; j++){
                System.out.print(line);
            }
            System.out.println();
        }
    }
}