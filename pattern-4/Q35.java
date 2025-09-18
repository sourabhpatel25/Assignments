/*
1
222
33333
4444444
555555555
*/

class Test{
    public static void main(String args[]){
        int r =5;

        for (int i=1; i<=r; i++){
            for (int j=1; j<=(2*i-1); j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}