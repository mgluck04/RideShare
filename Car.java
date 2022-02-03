import java.util.*;
public class Car {
    //fields
    private int oLoc;
    private int destination;
    private int numPassengers;
    private int direction;
    private int position;
    private ArrayList<Person> passengersC ;

    //constructor
    public Car(int myOLocation, int myPos, int myDest, int myNumPass, int myDirection){
        oLoc = myOLocation;
        position = myPos;
        destination = myDest;
        numPassengers = myNumPass;
        direction = myDirection;
        passengersC = new ArrayList<Person>();
        
    }

    //methods
    public String toString(){
        return ("Starting Position: " + oLoc + " ");
    }

    public void drive(){
       if(position == destination){
           System.out.println("The Car is at its destination");
       }
       if(position > destination){
           position --;
       }
       if(position < destination){
           position ++;
       }
       
    }
    public int getOLoc(){
        return oLoc;
    }
    public int getDestination(){
        return destination;
    }
    public int getNumPassengers(){
        return numPassengers;
    }
    public int getDirection(){
        return direction;
    }
    public int getPosition(){
        return position;
    }
}
