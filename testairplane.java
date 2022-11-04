import java.util.Scanner;
public class testairplane {
    public static void main(String []arg){
        Scanner inp=new Scanner(System.in);
        AirReservation passenger1=new AirReservation();
        while(true){ 
        System.out.println("Press 1 for seat in first class and 2 for econmy class )");
        int choice=inp.nextInt();
         switch(choice){
        case 1:
         passenger1.first_class();
         continue;
         case 2:
        passenger1.econmy_class();
        continue; 
        }
        inp.close();
       }
       }
}
