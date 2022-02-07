public class Person{
    //fields
   
    private int destination;
    

    //constructor
    public Person(){
        
        destination =(int) (Math.random() * 31) +1; 
       
    }
    
    //methods
    public String toString(){
        return   "dest = " + destination;
    }
    public int getDestination(){
        return destination;
    }
    
}