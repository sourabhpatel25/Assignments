/*
A
BCD
EFGHI
JKLMNOP
*/
class Test{
    public static void main(String args[]){
  int n =6;
  char ch = 'A';
        for (int line=1; line<=n ; line++){
            for (int chars=1; chars<=line*2-1; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}