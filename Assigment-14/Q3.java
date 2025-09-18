class Task{
    synchronized public String m1(){
        return "m1";
    }
    synchronized public String m2(){
         return "m2";
    }
    synchronized public String m3(){
        return "m3";
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
    System.out.println(t.m2() + " " + Thread.currentThread().getName());
      }   
   }
 }
 class MyThread3 extends Thread{
   Task  t;
   public MyThread3(Task t){
    this.t=t;
   }
   public  void run(){
   for(int i=0;i<5;i++){
    System.out.println(t.m3() + " " + Thread.currentThread().getName());
      }   
   }
 }
 
class Test{
    public static void main (String args[]){
         Task t= new Task();

         MyThread1 t1=new MyThread1(t);
         MyThread2 t2=new MyThread2(t);
         MyThread2 t3=new MyThread2(t);
          t1.start();
          t2.start();
          t3.start();
    }
}