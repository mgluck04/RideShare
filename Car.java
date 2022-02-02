public class Car {
    //fields
    private int oLoc;
    private int destination;
    private int numPassengers;
    private int direction;
    private int position;

    //constructor
    public Car(int myOLocation, int myPos, int myDest, int myNumPass, int myDirection){
        oLoc = myOLocation;
        position = myPos;
        destination = myDest;
        numPassengers = myNumPass;
        direction = myDirection;
    }

    //methods
    public String toString(){
        return ("Starting Position: " + oLoc + " ");
    }

    public void drive(){
        position += 1;
    }
}
