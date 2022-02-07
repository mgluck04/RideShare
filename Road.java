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
            for(int j = 0; j < 5; j++){
                int x =(int) (Math.random() * 2);
                if(x == 0){
                    road[i].personAdd(new Person() );
                }
    
            }
        
            
        }
        
    }
    
   
    

    //methods

    //to string will loop through stations and add info to a variable
    
    


}
