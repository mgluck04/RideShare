public class RideRunner {
    public static void main(String[] args) {
         Road r1 = new Road();
         System.out.println(r1.toString());
         System.out.println(r1.carToString());

         for(int i = 0; i< 33; i++){
            r1.movePeople();
            r1.roadDrive();;
         

         }
         System.out.println(r1.toString());
         System.out.println(r1.carToString()); 
         
    }
}
