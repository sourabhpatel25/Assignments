//case 1 
class Task{
    synchronized public String m1(){
        return "m1";
    }
    // synchronized public String m2(){
    //     return "m2";
    // }synchronized public String m3(){
    //     return "m3";
    // }
}
 class MyThread extends Thread{
   Task  t;
   public MyThread(Task t){
    this.t=t;
   }
   public  void run(){
   for(int i=0;i<5;i++){
    System.out.println(t.m1() + " " + Thread.currentThread().getName());
      }
      
   }
 }
class Test{
    public static void main (String args[]){
         Task t= new Task();

         MyThread t1=new MyThread(t);
         MyThread t2=new MyThread(t);
          
          t1.start();
          t2.start();
    }
}