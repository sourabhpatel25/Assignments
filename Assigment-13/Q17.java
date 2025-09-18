// 7. Network Connection

// Suppose you are connecting to a server. The connection might fail due to network issues.

// Which exception will be thrown?

// Should you handle it with try-catch or let it propagate using throws? Why?

class Test{
    public static void main(String args[]){
        try{
            throw new java.net.ConnectException("Connection failed due to netowrk lost.");
        } catch(java.net.ConnectException e){
            e.printStackTrace();
        }
    }
}