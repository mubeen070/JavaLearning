import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date(19, 9, 2001);
        Scanner inp = new Scanner(System.in);
        date.displayDate(); 

        System.out.println("\nEnter the day");
        date.setDay(inp.nextInt()); 

        System.out.println("\nEnter the month");
        date.setMonth(inp.nextInt());

        System.out.println("\nEnter the year");
        date.setYear(inp.nextInt());

        date.displayDate();

        inp.close();
    }
}
