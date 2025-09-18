/*
Car Info Manager
Create a class Car with fields: brand, model, and year.
Use setters to assign values. Create a method to print full car info.
*/

class Car{
    private String brand ;
    private String  model;
    private int year;
    public void setvalue(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    

}
public String setbrand(){
    return brand;
}
public String setmodel(){
    return model;
}
public int setyear(){
    return year;
}
public void fullCarinfo(){
    System.out.println("Brand        : " + brand);
     System.out.println("Model       : " + model);
    System.out.println("Year         : " + year);

}
}

class TestMain{
    public static void main(String args[]){
     Car obj =new Car();
     obj.setvalue("TOYATO","FORTUNAR",2025);
     obj.fullCarinfo();
     //getter method
        //System.out.println("\n");
       // System.out.println(obj.getbrand());
        //System.out.println(obj.getmodel());
       // System.out.println(obj.getyear());
    }
    
}