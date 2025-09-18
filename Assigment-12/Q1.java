// Problem Statement 

// You are building a transportation system for a logistics company.

// Requirements:

// Every Vehicle should have:

// a registration number,

// a method to start,

// a method to stop.

// Some vehicles run on Fuel (like Car, Truck), while others run on Electricity (like ElectricBike, ElectricCar).

// Create an interface Chargeable that forces all electric vehicles to implement:

// chargeBattery() method.

// Create an abstract class Vehicle that:

// Stores the registration number.

// Has abstract methods start() and stop().

// Has a concrete method displayInfo() to show vehicle details.

// Create subclasses:

// Car (inherits from Vehicle) → Fuel based.

// Truck (inherits from Vehicle) → Fuel based.

// ElectricBike (inherits from Vehicle and implements Chargeable).

// ElectricCar (inherits from Vehicle and implements Chargeable).

// In the main class (TransportSystem),

// Create objects of all types of vehicles.

// Call their methods (start, stop, chargeBattery where required).

// Expected Output Example
// Car starting with petrol engine...
// Car KA01AB1234 stopped.
// Truck KA02XY9876 starting with diesel engine...
// Truck KA02XY9876 stopped.
// Electric Bike KA03EL5678 starting silently...
// Electric Bike KA03EL5678 battery charging...
// Electric Bike KA03EL5678 stopped.
// Electric Car KA04EV4321 starting silently...
// Electric Car KA04EV4321 battery charging...
// Electric Car KA04EV4321 stopped.
// ------------------------------------------------------------------------------------------------------------------------------
interface  chargeable{
    public void chargeBattery();
}
abstract class Vehicles{

     private String registration_no;
     Vehicles(){}


     public Vehicles(String registration_no){
     this.registration_no=registration_no;
     }

    abstract public void toStart();
    abstract public void toStop();

    public void displayInfo(){
        System.out.println("Details of Vehicles");

      }
    }
    class Car extends Vehicles{
        Car(){}
        public Car(String r){
            super(r);
        }
        public void toStart(){
            System.out.println("Car is start");

        }
        public void fule(){
            System.out.println("Car starts with petrol engine");
        }
        public void toStop(){
            System.out.println("Car KA01AB1234 stopped");
        }
    }
      class Truck extends Vehicles{
        Truck(){}
        public Truck(String r){
            super(r);
        }

        public void toStart(){
            System.out.println("Truck is start");
        }
        public void fule(){
            System.out.println("Truck starts with desile engine");
        }
        public void toStop(){
            System.out.println("Truck KA02XY9876 stopped.");
        }
      }

     class ElectricBike extends Vehicles implements chargeable{
        
          ElectricBike(){}
        public ElectricBike(String r){
            super(r);
        }

        public void toStart(){
            System.out.println("Electric bike starting silently");
        }
        public void toStop(){
            System.out.println("Electric bike Stoppped");
        } 
        public void chargeBattery(){
            System.out.println("Bike is charge");
        }
     }
     class ElectricCar extends Vehicles implements chargeable{
        
          ElectricCar(){}
        public ElectricCar(String r){
            super(r);
        }

        public void toStart(){
            System.out.println("Electric car starting silently");
        }
        public void toStop(){
            System.out.println("Electric car Stoppped");
        } 
        public void chargeBattery(){
            System.out.println("Car is charge");
        }
     }
     class TransportSystem{
        public static void main(String args[]){
            
            Car c=new Car("KA01AB1234");
            c.toStart();
            c.fule();
            c.toStop();
        
            Truck t=new Truck("KA02XY9876");
            t.toStart();
            t.fule();
            t.toStop();

            ElectricBike e=new ElectricBike(" KA03EL5678");
            e.toStart();
            e.toStop();
            e.chargeBattery();

            ElectricCar s=new ElectricCar("KA04EV4321");
            s.toStart();
            s.toStop();
            s.chargeBattery();
            
        }
     }
     