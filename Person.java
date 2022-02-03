public class Person{
    //fields
   
    private int destination;
    

    //constructor
    public Person(){
        
        destination = 10;
       
    }
    
    //methods
    public String toString(){
        return   "dest = " + destination;
    }
    public int getDestination(){
        return destination;
    }
    
}