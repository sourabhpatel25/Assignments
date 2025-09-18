//4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.
class Test {
    public static void main (String args []){

        int length = 300;
        int breadth = 150; 
        int rate = 6; // $ per 100 square meter
        int area = length * breadth;
        int cost = (area / 100) * rate;
        System.out.println("Area of land: " + area + " m^2");
        System.out.println("Total cost of tiling: $" +cost);}
}