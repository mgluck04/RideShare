import java.util.*;
public class Road {
    //fields
    private Station[] road;
    private ArrayList<Car> carAL; 

    //constructor
    public Road()
    {   
        carAL = new ArrayList<Car>();
        road = new Station[31];
        for(int i = 0; i<road.length; i++){
            road[i]= new Station(i);
            
        }
    }
    
    //main mock
    Car c1 = new Car(4, 4, 10, 1);

    //methods
    


}
