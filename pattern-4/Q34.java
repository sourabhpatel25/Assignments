/*
1
12
123
12345
1234567
123456789
*/

class Test{
    public static void main(String args[]){
  int n =9;
        for (int line=1; line<=n ; line++){
            for (int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}