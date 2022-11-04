/*import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTotalSales {
    public static void main(String[] args) {

        TotalSales comp = new TotalSales();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 to end");
        // comp.setSales(new double[5][6]);
        while (true) {
            try {
                System.out.println("Enter the SalesPerson, Product and the Total Sales: ");
                comp.setSalesPerson(in.nextInt());
                if (comp.getSalesPerson() == 0)
                    break;
                comp.setProduct(in.nextInt());
                comp.setValue(in.nextDouble());
                comp.setElements(comp.getSalesPerson() - 1, comp.getProduct() - 1, comp.getValue());
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please reenter: ");
                break;
            }
        }
        in.close();
    }
}
*/