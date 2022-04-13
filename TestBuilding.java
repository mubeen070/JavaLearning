import java.util.Scanner;

public class TestBuilding {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);    
        Building house = new Building();
        Building office = new Building();
        System.out.println("\nEnter the area and occupants:");
        house.area = inp.nextDouble();
        house.occupants = inp.nextInt();
        house.areaperperson();

        System.out.println("\nEnter the area and occupants:");
        office.area = inp.nextDouble();
        office.occupants = inp.nextInt();
        office.areaperperson();
        inp.close();
    }
    
}
