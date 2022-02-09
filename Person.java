public class Person{
    //fields
   
    private int destination;
    private int location;
    

    //constructor
    public Person(){
        
        destination =(int) (Math.random() * 31) ; 
       
    }
    
    //methods
    public String toString(){
        return   "Destinaton:  " + destination;
    }
    public int getDestination(){
        return destination;
    }
    
}