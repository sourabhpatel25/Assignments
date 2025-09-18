//8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².

class Test {
    public static void main(String args []){
        int height = 20;        
        double areaInM2 = 0.8;
        double area = areaInM2 * 10000;
        double base = (2 * area) / height;
        System.out.println("Height: " + height + " cm");
        System.out.println("Area: " + area + " cm^2");
        System.out.println("Base of triangle: " + base +"cm");}
}