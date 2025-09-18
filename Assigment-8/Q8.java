/*
Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).
*/
class Mobile {
    private String brand ;
    private String  model;
    private double price;
    public void setvalue(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    

}
public boolean isPhone(){
    return (price<20000);
}
public String setbrand(){
    return brand;
}
public String setmodel(){
    return model;
}
public double setprice(){
    return price;
}
public void displayDetails(){
    System.out.println("Brand : " + brand);
     System.out.println("Model    : " + model);
    System.out.println("Price      : ₹" + price);
    System.out.println("  Phone is affordable    : " +isPhone() );

}
}

class TestMain{
    public static void main(String args[]){
     Mobile obj =new Mobile();
     obj.setvalue("Iphone","Pro max",4500);
     obj.displayDetails();
        //getter method
        //System.out.println("\n");
        // System.out.println(obj.getbrand());
        //System.out.println(obj.getmodel());
        // System.out.println(obj.getprice());
    }
    
}