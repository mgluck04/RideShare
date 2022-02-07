import java.util.*;

public class Station {
    //fields
    private ArrayList<Person> stationAL; 
    private int stationNum;
     

    //constructor
    public Station(int num){
        stationAL = new ArrayList<Person>();
        stationNum = num;


    }
    
    //methods
    public void personAdd(Person person){
        stationAL.add(person);
    }
    public void setStationNum(int numSet){
        stationNum = numSet;
    }
    public void personRemove(int pos){
        stationAL.remove(pos);
    }
    public Person nextLeftPerson(){
        for(int i = 0; i<stationAL.size(); i++){
            if(stationAL.get(i).getDestination() < stationNum){
                return stationAL.remove(i);

            }
        }
        return null;
    }
    public Person nextRightPerson(){
        for(int i = 0; i<stationAL.size(); i++){
            if(stationAL.get(i).getDestination() > stationNum){
                return stationAL.remove(i);
            }

        }
        return null;
    }
    public String toString(){
        return( "Station Number: " + stationNum + "List of People in Station: " + stationAL.toString() );
    }




}
