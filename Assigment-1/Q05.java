//5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
class Test {
    public static void main (String args []){

         int cost = 1600; 
         int ratePerSqM = 25;
         int length = 20;
         int area = cost / ratePerSqM;
         int breadth = area / length;
         int perimeter = 2 * (length + breadth);
        System.out.println("Area of the park: " + area + " m^2");
        System.out.println("Breadth of the park: " + breadth + " m");
        System.out.println("Perimeter of the park: " + perimeter +"m");}
}