public class Car {
    //fields
    private int originalLocation;
    private int destination;
    private int numPassengers;
    private int position;

    //constructor
    public Car(){
        originalLocation = 0;
        position = originalLocation;
        destination = 5;
        numPassengers = 0;
    }

    //methods
    public String toString(){
        return ("" + destination);
    }

    public void drive(){
        position += 1;
    }
}
