/*
12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.
*/
class Airplane{
    private int flightnumber;
    private String destination;
    private String departure;
    private boolean status;

    public Airplane(int flightnumber,String destination,String departure){
     this.flightnumber=flightnumber;
     this.destination=destination;
     this.departure=departure;
    
}

public void display(){
    System.out.println("\nFlight Number: "+this.flightnumber+ "\nDestionation: "+this.destination+"\nDeparture :"+this.departure);
}
public void isDelay(){
    if(status){
        System.out.println("Your flight is dealy-------");
    }else{
        System.out.println("Your flight on time---------");
    }
}

public void delay(){
    this.status = true;
}
}
class TestMain{
    public static void main(String args[]){
        Airplane A1=new Airplane(2005,"American","12:10-AM");
        A1.display();
        A1.delay();
        A1.isDelay();
      }
}