import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Time obj = new Time();
        System.out.println("Enter Hours and then mintes:");
        obj.setTime(inp.nextInt(), inp.nextInt());
        obj.displayTime();
        obj.displayMinutes();
        inp.close();
    }
}
