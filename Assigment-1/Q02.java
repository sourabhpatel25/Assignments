//2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter.
class Test {
    public static void main(String args[]){
        int area=96;
        int breadth=8;
        int length=area/breadth;
        int perimeter=2*(length+breadth);
        System.out.println("Breadth: " + breadth + " cm");
        System.out.println("Length: " + length + " cm");
        System.out.println("Perimeter: " + perimeter + " cm");}}