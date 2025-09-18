
/*
1
22
333
4444
55555
*/

class Test{
    public static void main(String args[]){
        int r =5;

        for (int line=1; line<=r; line++){
            for (int j=1; j<=line; j++){
                System.out.print(line);
            }
            System.out.println();
        }
    }
}