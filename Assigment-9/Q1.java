class Time{
    private int H;
    private int M;
    private int S;
    public Time(int H,int M,int S){
     this.H=H;
     this.M=M;
     this.S=S;
}
public Time(){}
public Time add(Time T2){
    Time temp=new Time();
    temp.H=this.H +T2.H;
    temp.M=this.M +T2.M;
    temp.S=this.S +T2.S;
     if(temp.S>=60){
        temp.M+=(temp.S/60);
        temp.S%=60;
     }if(temp.M>=60){
        temp.H+=(temp.M/60);
        temp.M%=60;
     }
     return temp;
        
}
public void display(){
    System.out.println(this.H+"Hours"+this.M+"Minute"+this.S+"Second");
}
}
class TestMain{
    public static void main(String args[]){
        Time T1=new Time(12,60,45);
        Time T2=new Time(13,20,25);
        T1.display();
        T2.display();
        Time result=T1.add(T2);
        result.display();        

      }
      }
