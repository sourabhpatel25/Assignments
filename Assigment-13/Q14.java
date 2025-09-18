// 4. E-commerce Discount Calculation

// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

// Which exception will occur?

// How will you ensure the program continues and doesn’t stop execution?

class Ecommerce{
    public static void main(String args[]){
        int totalAmount =1000;
        int quantity = 0;
        try{
            int peritemPrice=totalAmount/quantity;
            System.out.println("Per Item Price is:" + peritemPrice);
        }
        catch(ArithmeticException e){
            System.out.print("Cannot divided by 0!  Quantity must be greater the 0.");
        }
        System.out.println("Program run smothly");
    }
}