import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of  arry");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("enter the value's");
            arr[i] = sc.nextInt();
        } 
        
        System.out.println("replace all element with 0 which is multiple of 5");

        
        for(int i=0; i<size; i++){
            if(arr[i] % 5==0)
            System.out.println(arr[i] * 0);
            else 
            System.out.println(arr[i]);
        }

}
}