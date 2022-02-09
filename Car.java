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
    public Car(int myOLocation, int myPos, int myDest, int myNumPass){
        oLoc = myOLocation;
        position = myPos;
        destination = myDest;
        numPassengers = myNumPass;
        if(myDest > myOLocation){
            direction = 1;
        }
        if(myDest < myOLocation){
            direction = -1;
        }

        passengersC = new ArrayList<Person>();
        
    }
    public Car(){
        oLoc = (int) (Math.random() * 31) +1; 
        position = oLoc;
        destination = (int) (Math.random() * 31) +1; 
        passengersC = new ArrayList<Person>();
        for(int i = 0; i <3; i++){
            int random = (int) (Math.random() * 2);
            if( random == 1){
                passengersC.add(new Person());
            }
        }
        
    }

    //methods
    public void addPpl(Person p){
        passengersC.add(p);
    }

    public String toString(){
        return (" Starting Position:" + oLoc + " Destination:" + destination + " Position:" + position + " Number of Passengers: " + passengersC.size() + "\n");
    }

    public void drive(){

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
