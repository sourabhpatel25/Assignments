class Task{
    synchronized public static String m1(){
        return "m1";
    }
}
 class MyThread1 extends Thread{
   Task  t;
   public MyThread1(Task t){
    this.t=t;
   }
   public  void run(){
   for(int i=0;i<5;i++){
    System.out.println(t.m1() + " " + Thread.currentThread().getName());
      }
   
   }
 }
 class MyThread2 extends Thread{
   Task  t;
   public MyThread2(Task t){
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
         Task th1= new Task();
         Task th2= new Task();

         MyThread1 t1=new MyThread1(th1);
         MyThread2 t2=new MyThread2(th2);
      
          t1.start();
          t2.start();
 
    }
}