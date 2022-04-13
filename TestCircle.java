import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        circle obCircle = new circle();
        circle obCircle2 = new circle();

        System.out.println("Enter the value of radius.\n");
        obCircle.setRadius(inp.nextDouble());
        System.out.println("\nArea:" + obCircle.getArea());
        System.out.println("_________________________________________________");
        System.out.println("Circumference:" + obCircle.getCircumference());
        System.out.println("_________________________________________________");
        System.out.println("Enter the value of radius.\n");
        obCircle2.setRadius(inp.nextDouble());
        System.out.println("\nArea:" + obCircle2.getArea());
        System.out.println("_________________________________________________");
        System.out.println("\nCircumference:" + obCircle2.getCircumference());

        inp.close();
    }
}
