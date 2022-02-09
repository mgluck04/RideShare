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

    public void addCar(Car c){
        carAL.add(c);
    }

    public void move(){
        for(int s = 0; s < road.length; s++){
            for(int c = 0; c < carAL.size(); c++){
                if(carAL.get(c).getDirection() == 1){
                    for(int i = 0; i < road[s].getStationAL().size(); i++){
                        carAL.get(c)
                    }
                }
            }
           
        }    
    }

    //to string will loop through stations and add info to a variable
    public String toString(){
        String str = "";
        for(Station x : road){
            str += x.toString();

        }
        return str;
    }

    
    


}
