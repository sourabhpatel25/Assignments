// Problem 7: E-commerce Order System 

// Abstract class Order:

// orderId, amount

// abstract methods processOrder(), cancelOrder()

// concrete method orderSummary()

// Subclasses:

// OnlineOrder

// StorePickupOrder

// Interface DiscountApplicable with applyDiscount() method.

// Only OnlineOrder gets discount.

abstract class Order{
    private int orderid;
     private double amount;
    public Order(int orderid,double  amount){
        this.orderid=orderid;
        this.amount=amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }

   
    abstract public void processOrder();
    abstract public void cancelOrder();
     public void orderSummary(){
      System.out.println("order id "+orderid+"   amount "+amount);
     }

}
interface  DiscountApplicable{
    void applyDiscount(double percent);
}
class OnlineOrder extends Order implements DiscountApplicable{
    public  OnlineOrder(int orderId,double  amount){
        super(orderId, amount);
    }
    public void processOrder(){
        System.out.println("add the product to cart and placed the order...");
    }
    public void cancelOrder(){
        System.out.println("cancel the order...");
    }
    public void applyDiscount(double percent){
        double setamt =  getAmount()-getAmount() * percent / 100;
        System.out.println("Discount applied! New amount = " +setamt );
    }
}
class StorePickupOrder extends Order{
    public  StorePickupOrder(int orderId,double amount){
        super(orderId, amount);
    }
    public void processOrder(){
        System.out.println("add the product to cart and make the payment ...");
    }
    public void cancelOrder(){
        System.out.println("cancel the order...");
    }
}
class Test{
    public static void main(String args[]){
        OnlineOrder o=new OnlineOrder(1011,500);
        o.orderSummary();
        o.processOrder();
        o.cancelOrder();
        o.applyDiscount(10);
         StorePickupOrder s=new StorePickupOrder(1012,3000);
        s.orderSummary();
        s.processOrder();
        s.cancelOrder();
    }
}