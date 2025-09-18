
/*
1
00
111
0000
11111
*/
class Test{
    public static void main(String args[]){
        int r =5;

        for (int line=1; line<=r; line++){
            int digit=(line%2==0)?0:1;
            for (int j=1; j<=line; j++){
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}