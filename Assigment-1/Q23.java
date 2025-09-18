/* 23. Find the number of cubical boxes of side 3 cm which can be accommodated in a carton of dimensions 15 cm × 9 cm × 12 cm.
 Find number of 3 cm cubical boxes that fit in a 15×9×12 cm carton

*/

class Test {
    public static void main(String args[]) {
        int boxSide=3;
        int cartonLength=15;
        int cartonBreadth=9;
        int cartonHeight=12; 

        int countLength=cartonLength*boxSide;
        int countBreadth=cartonBreadth/boxSide;
        int countHeight=cartonHeight/boxSide;
        int totalBoxes=countLength*countBreadth*countHeight;
        
        System.out.println("Number of boxes along length: "+countLength);
        System.out.println("Number of boxes along breadth: "+countBreadth);
        System.out.println("Number of boxes along height: "+countHeight);
        System.out.println("Total cubical boxes that fit: "+totalBoxes);}
}