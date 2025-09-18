// Problem 5: Smart Home System 🏠💡

// Abstract class Appliance:

// name, power

// abstract methods turnOn(), turnOff()

// concrete method showStatus()

// Subclasses:

// Fan

// Light

// WashingMachine

// Interface SmartDevice with method connectWifi().

// Only Light and WashingMachine are smart devices.

// In main method, turn on/off appliances and connect smart ones to WiFi.
interface SmartDevice{
    void connectWifi();
}
abstract class Appliance{
    String name;
    String power;
    Appliance(String name,String power){
        this.name=name;
        this.power=power;

    }
    abstract void turnOn();
    abstract void turnOff();
    public void showStatus(){
     System.out.println(" Name of Appliance : "+name+  "  power : "+power);
     System.out.println(name+ " is working");   
    }
}
class Fan extends Appliance{
    Fan(String name,String power){
        super(name,power);
    }
     void turnOff(){
        System.out.println("fan turned off");
    }
     void turnOn(){
        System.out.println("fan turned on");
    }
    
}
class Light extends Appliance implements SmartDevice{
    Light(String name,String power){
     super(name,power);   
    }
     void turnOn(){
    System.out.println("light turned on");    
    }
    void turnOff(){
    System.out.println("light turned off");
}
    public void connectWifi(){
     System.out.println("this Appliance is connected to the wifi");   
    }
}
class WashingMachine extends Appliance implements SmartDevice{
    WashingMachine(String name,String power){
    super(name,power);    
    }
    void turnOn(){
    System.out.println("Washinemachine turned on");    
    }
    void turnOff(){
    System.out.println("Washine machine turned off");    
    }
    public void connectWifi(){
      System.out.println("this appliance is connected to the wifi");  
    }
}

class SmartHomeDevice{
 public static void main(String args[]){
 Appliance s1=new Fan("Sujata Fan ","20hz");
 s1.turnOn();
 s1.showStatus();
 s1.turnOff();

 System.out.println("--------------------------------");
 Appliance s2=new Light("philips Light ","5hz");
 s2.turnOn();
 s2.showStatus();
 s2.turnOff();
 Light l=(Light ) s2;
 l.connectWifi();
 

 System.out.println("-------------------------------");
Appliance s3=new WashingMachine("penasonic washing machine","50hz");
s3.turnOn();
s3.showStatus();
s3.turnOff();
WashingMachine w=(WashingMachine) s3;
w.connectWifi(); 

 }   
}
