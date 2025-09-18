import java.util.Scanner;


   
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int totlaGardenArea,totalPathWayarea,crossection;
         int gardenlength,gardenbreadth;
        gardenlength=sc.nextInt();
        gardenbreadth=sc.nextInt();
        totlaGardenArea=gardenlength*gardenbreadth;

         int polength,pobreadth;
        polength=sc.nextInt();
        pobreadth=sc.nextInt();
         int ptlength,ptbreadth;
        ptlength=sc.nextInt();
        ptbreadth=sc.nextInt();
        totalPathWayarea=(polength*pobreadth)+(ptlength*ptbreadth);

        crossection=3*4;
        int totaluseablearea=totlaGardenArea-(totalPathWayarea-crossection);
        System.out.println(totaluseablearea);
        System.out.println(crossection);
        System.out.println(totalPathWayarea);
        System.out.println(totlaGardenArea);

    }
}