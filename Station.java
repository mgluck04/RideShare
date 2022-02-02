import java.util.*;

public class Station {
    //fields
    private ArrayList<People> station; 
    private int[] stationNumber;
     

    //constructor
    public Station(){
        stationNumber = new People[31];
    }

    //methods
    public void personAdd(People person1){
        stationNumber[People.originLoc()] = person1;
    }


}
