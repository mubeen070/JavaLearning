import java.util.Scanner;

public class AirReservation {

    boolean []seats=new boolean[10];
    int count_2;
   Scanner inp=new Scanner(System.in);
   public void first_class(){
       if(checkSeats()){
           count_2=0;
        for(int i=0;i<seats.length/2;i++)       //in index 0-4 first class and 5-9 econmy class
            {
            if(seats[i])
            count_2++;
            }
            if(count_2==5)
            {
                System.out.println("First class is full");
                System.out.println("Press 2 to go on econmy class");
                int accept_choice=inp.nextInt();
                if(accept_choice==2)
                {
             econmy_class();
                }
            }
    else{
    System.out.println("Enter the seat no from 1-5 in first class");
    int seat_no=inp.nextInt();
    if(seats[seat_no-1])
    {
    System.out.println("The seat is already Booked");
    return;
    }
    else
    {
        seats[seat_no-1]=true;
        display_info();
    }
   }
   }
   }
   public void econmy_class(){
        if(checkSeats()){
            count_2=0;
            for(int i=5;i<seats.length;i++)       //in index 0-4 econmy class and 5-9 first class
            {
            if(seats[i])
                count_2++;
            }
            if(count_2==5)
            {
                System.out.println("Econmy class is full");
                System.out.println("Press 1 to book in firstclass");
                int choice=inp.nextInt();
                if(choice==1)
                {
                    first_class();
                }
            }
         else{
        System.out.println("Enter the seat no from 6-10 in econmy class");
        int seat_no=inp.nextInt();
        if(seats[seat_no-1])
    {
        System.out.println("The seat is already Booked");
        return;
    }
    else
    {
    seats[seat_no-1]=true;
    display_info();
    }
   }
   }
    
   }
   
   public boolean checkSeats(){
     int count=0;
    for(int i=0;i<seats.length;i++)
            {
            if(seats[i])
             count++;
            }
            if(count==10)
            {
            System.out.println("Next flight leaves in 3 hours");
            return false;
            }
            else
            return true;
            }
   
   public void display_info(){
       for(int i=0;i<seats.length;i++)
   {
     System.out.println(seats[i]);
   }
   }
 }