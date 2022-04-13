import java.util.Scanner;

public class TestDetailed {
    public static void main(String[] args) {



        DetailedMarkSheet obj1 = new DetailedMarkSheet();
        Scanner inp = new Scanner(System.in);
        System.out.println("\nEnter first name: ");
        obj1.setStudent_Name(inp.next());

        System.out.println("\nEnter father name: ");
        obj1.setStudent_FName(inp.next());

        System.out.println("\nEnter Address: ");
        obj1.setAddress(inp.next());

        System.out.println("\nEnter Class: ");
        obj1.setClass(inp.next());

        System.out.println("\nEnter roll no.: ");
        obj1.setRollNo(inp.nextInt());

        System.out.println("________________________");
        System.out.println("\n Enter total number of subjects.");
        obj1.setTotalSubj(inp.nextInt());

        System.out.println("\nEnter Subject names.");
        String[] subjects = new String[obj1.getTotalSubj()];
        for (int i = 0; i <= obj1.getTotalSubj() - 1; i++) {
            subjects[i] = inp.next();
        }

        System.out.println("\nEnter Total marks.");
        int[] totalMarks = new int[obj1.getTotalSubj()];
        for (int j = 0; j <= obj1.getTotalSubj()-1; j++) {
            totalMarks[j] = inp.nextInt();
        }

        System.out.println("\nEnter obtained marks.");
        double[] obtMarks = new double[obj1.getTotalSubj()];
        for (int k = 0; k <= obj1.getTotalSubj()-1; k++) {
            obtMarks[k] = inp.nextDouble();
        }

        obj1.Diplay();

        inp.close();
    }
}
