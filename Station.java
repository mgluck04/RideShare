import java.util.*;

public class Station {
    //fields
    private ArrayList<People> station; 
     

    //constructor
    public Station(){
        station = new ArrayList<People>();
    }
    public Station(People p1, People p2 ){
        station.add(p1);
        station.add(p2);

    }

    //methods
    public void personAdd(People person){
        station.add(person);
    }
    public void personRemove(int pos){
        station.remove(pos);
    }
    public People



}
