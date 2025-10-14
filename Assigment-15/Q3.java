//Hello 1 World 2 Welcome 3.
class Test {
    public static void main(String args[]) {
        String s1 = "Hello 1 World 2 Welcome 3";
        int sum = 0;
        
        String[] numbers = s1.split(" ");
        for (String num : numbers) {
            try{
            sum += Integer.parseInt(num);
        }  
        catch(NumberFormatException e){}
    }
        System.out.println("Sum = " + sum);
    }

}