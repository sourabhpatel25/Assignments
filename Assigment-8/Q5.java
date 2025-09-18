/*
Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price).
*/

class Product{
    private int productId ;
    private String  name;
    private int quantity;
    private double  price;
    public void setvalue(int productId,String name,int quantity,double price){
        this.productId=productId;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
}
public double calculateTotalValue() {
        return quantity * price;
}

public int setproductId(){
    return productId;
}
public String setname(){
    return name;
}
public int setquntity(){
    return quantity;
}
public double setprice(){
    return price;
}
public void values(){
    System.out.println("ProductId   : " +productId);
     System.out.println("Name       : " + name);
    System.out.println("Quntity     : " + quantity);
     System.out.println("Price      : " + price);
    System.out.println(" total value"+calculateTotalValue());


}
}

class TestMain{
    public static void main(String args[]){
     Product obj =new Product();
     obj.setvalue(101,"Apple Phone",2,500000);
     obj.values();
        //getter method
         //System.out.println("\n");
         // System.out.println(obj.getproductId());
         //System.out.println(obj.getName());
         //System.out.println(obj.getquntity());
         //System.out.println(obj.getprice());

    
    }
    
}