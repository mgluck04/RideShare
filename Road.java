import java.util.*;
public class Road {
    //fields
    private Station[] road;

    //constructor
    public Road()
    {
        road = new Station[31];
        for(int i = 0; i<road.length; i++){
            road[i]= new Station(i);
            
        }
    }
    
    //methods
    


}
