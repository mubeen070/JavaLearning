import java.util.*;

public class TestFlight {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       // Scanner inp2 = new Scanner(System.in);
        
        
        flight obj1 = new flight();
        flight obj2 = new flight("Pk22","Toronto","NewYork");
        int totalSeats1;
        short totalSeats2;
        System.out.println("Enter total seats req : \t");
        totalSeats1 =inp.nextInt();
        //inp.nextLine();
        obj1.bookFlight(totalSeats1);
        obj1.displayFlight();


        System.out.println("Enter total seats req : \t");
        // if(inp.hasNextInt()){
          
            totalSeats2 =inp.nextShort();
            obj2.bookFlight(totalSeats2);
        // }
        
        obj2.displayFlight();
        inp.close();
        //inp.close();      
    }

}
