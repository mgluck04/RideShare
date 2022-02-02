public class People{
    //fields
    private int originalLocation;
    private int currentLocation;
    private int destination;

    //constructor
    public People(){
        originalLocation = 5;
        destination = 10;
        currentLocation = originalLocation;
    }
    
    //methods
    public String toString(){
        return "loc = " + currentLocation + "dest = " + destination;
    }

    public int originLoc(){
        return originalLocation;
    }
}