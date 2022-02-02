import java.util.*;

public class Station {
    //fields
    private ArrayList<People> station; 
     

    //constructor
    public Station(){
        station = new ArrayList<People>();
    }

    //methods
    public void personAdd(People person){
        station.add(person);
    }


}
