import java.util.*;

public class flight {
    Scanner inp = new Scanner(System.in);
    private String flightNo;
    private String flightSource;
    private String flightDestination;
    int arraysize = 10;
    boolean[] seats = new boolean[arraysize];

    public flight() {
        flightNo = "Pk21";
        flightSource = "Islamabad";
        flightDestination = "Lahore";
    }

    public flight(String fn, String fs, String fd) {
        this.flightNo = fn;
        this.flightSource = fs;
        this.flightDestination = fd;
    }

    public void bookFlight(int totalSeats) {

       
        int seatNo;
        int booked_seats = 0;

        if (totalSeats != seats.length) {
            for (int i = 0; i < totalSeats; i++) {
                System.out.println("\nEnter the seat no.(0-"+arraysize+")");
                seatNo = inp.nextInt();
                seats[seatNo - 1] = true;

            }
        }
        if (totalSeats == seats.length) {
            for (int l = 0; l < seats.length; l++) {
                seats[l] = true;
            }
            System.out.println("\nYour next flight is in 1hour.");
        }

        for (int j = 0; j < arraysize; j++) {
            if (seats[j] == true) {
                booked_seats++;
            }
        }

        if (booked_seats == seats.length) {
            System.out.println("\nYour next flight is in 1hour.");
        }

        inp.close();
    }

    public void displayFlight() {

        int booked = 0, available = arraysize;
        System.out.print("\n\nFlight Number:\t\t" + flightNo + "\nFlight Source:\t\t" + flightSource
                + "\nFlight Destination:\t" + flightDestination);
        for (int k = 0; k < arraysize; k++) {
            if (seats[k] == true) {
                System.out.print("\nSeat no:" + (k + 1) + "\tBooked\t\t" );
                System.out.print("\t");
            }
            if (seats[k] == false) {
                System.out.print("\nSeat no:" + (k + 1) + "\tAvailable\t" );
                System.out.print("\t");
            }
            if (seats[k] == true) {
                booked++;
            }

        }
        available -= booked;
        System.out.println("\nThe total available seats are:\t" + available);
    }
}
