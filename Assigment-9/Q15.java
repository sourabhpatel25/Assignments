/*
13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
*/
import java.util.ArrayList;
class collection{
    ArrayList<Inventory>b=new ArrayList<Inventory>();
    public void addProducts(Inventory products){
        b.add(products);
    }
    public void removeProducts(Inventory products){
        b.remove(products);
    }
    public void displayproductsdetail(){
        for(Inventory products:b){
            System.out.print(products.getFullDetial()+"\n");
        }
    }
    public void isInventory(){
        if(b.size()< 5){
            System.out.println("Low Inventory-------");
        }else{
            System.out.println("Greater Inventory-------");
        }
    }
}

class Inventory{
    private String products;
    
    public Inventory(String products){
        this.products = products;
    }
    public Inventory(){};
    public String getFullDetial(){
        return products;
    }


}
class TestMain{
    public static void main(String args[]){
        Inventory b1 = new Inventory("Phone");
        Inventory b2 = new Inventory("Computer");
        Inventory b3 = new Inventory("Bottle");
         Inventory b4 = new Inventory("Bottle");
          Inventory b5 = new Inventory("Bottle");
        collection bk=new collection();
        bk.addProducts(b1);
        bk.addProducts(b2);
        bk.addProducts(b3);
        bk.addProducts(b4);
        bk.addProducts(b5);

        bk.displayproductsdetail();
        System.out.println("_");
        // bk.removeProducts();
        bk.displayproductsdetail();
        bk.isInventory();

}
}