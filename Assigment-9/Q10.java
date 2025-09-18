/*
8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green
*/
class Traffic{
    private int duration;
    private String signal;

    public Traffic(){}

    public Traffic(int duration, String signal){
        this.duration = duration;
        this.signal = signal.toLowerCase();
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setSignal(String signal){
        this.signal = signal.toLowerCase();
    }

    public void trafficSignal(){
        switch(signal){
            case "red":
                System.out.println("The signal is now " + signal + " you need to stop for " + duration + " seconds.");
                break;

            case "yellow":
                System.out.println("The signal is now " + signal + " you need to wait for it to change in " + duration + " seconds.");
                break;

            case "green":
                System.out.println("The signal is now " + signal + " you can go within " + duration + " seconds.");
                break;

            default:
                System.out.println("Invalid string given not matched to any case.");
        }
    }
}

class Test{
    public static void main(String args[]){
        Traffic t1 = new Traffic(28, "Red");
        t1.trafficSignal();
        t1.setDuration(24);
        t1.setSignal("Green");
        t1.trafficSignal();
    }
}