import java.util.*;

public class DetailedMarkSheet {
    private String student_Name;
    private String student_FatherName;
    private String Address;
    private String Class;
    private int rollNo;
    private int totalSub;
    private String[] subj = new String[totalSub];

    private int[] totalMarks;
    private double[] obtMarks;
    private int total = 0;
    private double ototal = 0.0, perc;
    public int test = 0;

    public DetailedMarkSheet() {

    }

    public DetailedMarkSheet(String sn, String sfn, String a, String c, int r) {
        this.student_Name = sn;
        this.student_FatherName = sfn;
        this.Address = a;
        this.Class = c;
        this.rollNo = r;

    }

    public void setStudent_Name(String sn) {
        this.student_Name = sn;
    }

    public void setStudent_FName(String sfn) {
        this.student_FatherName = sfn;
    }

    public void setAddress(String a) {
        this.Address = a;
    }

    public void setClass(String c) {
        this.Class = c;
    }

    public void setRollNo(int rn) {
        this.rollNo = rn;
    }

    public void setTotalSubj(int ts) {
        this.totalSub = ts;
    }

    public int getTotalSubj() {
        return totalSub;
    }

    public void setSubjects(String[] s) {
        this.subj = s;
    }

    public void setTotalMarks(int[] tm) {
        this.totalMarks = tm;
    }

    public void setObtMarks(double[] obtm) {
        this.obtMarks = obtm;

    }

    public void subjectInfo() {
        Scanner inp = new Scanner(System.in);

        System.out.println("________________________");
        System.out.print("\n Enter total number of subjects.");
        setTotalSubj(inp.nextInt());

        String[] subjects = new String[getTotalSubj()];
        int[] tm = new int[getTotalSubj()];
        double[] obtMarks = new double[getTotalSubj()];

        for (int i = 0; i < getTotalSubj(); i++) {
            System.out.print("Enter name of subject " + (i + 1) + ":\t");
            setSubjects(subjects);
            subjects[i] = inp.next();

            System.out.print("Enter Total marks of subject " + (i + 1) + ":\t");
            setTotalMarks(tm);
            tm[i] = inp.nextInt();

            System.out.print("Enter obtained marks of subject " + (i + 1) + ":\t");
            setObtMarks(obtMarks);
            obtMarks[i] = inp.nextDouble();
            if (obtMarks[i] > tm[i]) {
                System.out.println("wrong inp");
                test++;
                break;
            }
        }
        inp.close();
    }

    public void totalScore() {

        for (int i = 0; i < totalMarks.length; i++) {
            total += totalMarks[i];
            ototal += obtMarks[i];
        }

    }

    public void percentage() {
        perc = ototal / total * 100;
    }

    public void Diplay() {
        System.out
                .println("___________________________________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t\t\t\tRESULT CARD ");
        System.out
                .println("___________________________________________________________________________________________");
        System.out.println("\nStudent name:\t" + student_Name + "\nFather name:\t" + student_FatherName + "\nAddress:\t"
                + Address + "\nClass:\t\t" + Class + "\nRoll No:\t" + rollNo + "\n");
        System.out
                .println("___________________________________________________________________________________________");
        System.out.println(" Subject\t\tTotal Marks\t\t\tObtained Marks");
        System.out
                .println("___________________________________________________________________________________________");
        for (int k = 0; k < totalSub; k++) {

            System.out.println((k + 1) + ": " + subj[k] + "\t\t\t" + totalMarks[k] + "\t\t\t\t" + obtMarks[k]);

        }

        System.out
                .println("___________________________________________________________________________________________");
        System.out.println("\t\t\t" + total + "\t\t\t\t" + ototal);
        System.out
                .println("___________________________________________________________________________________________");
        System.out.printf("\t\t\t\t\t\t\tPercentage is:  %.2f%%\n", perc);
        System.out
                .println("___________________________________________________________________________________________");
    }

    public void computeGrade() {
        if (perc >= 85.0) {
            System.out.println("A Grade");
        } else if (perc >= 80.0 && perc < 85.0) {
            System.out.println("B Grade");
        } else if (perc >= 75.0 && perc < 80.0) {
            System.out.println("C Grade");
        } else if (perc >= 70.0 && perc < 75.0) {
            System.out.println("D Grade");
        } else if (perc >= 65.0 && perc < 70.0) {
            System.out.println("E+ Grade");
        } else if (perc >= 60.0 && perc < 65.0) {
            System.out.println("E Grade");
        } else if (perc >= 0.0 && perc < 60.0) {
            System.out.println("YOU ARE FAIL!");
        }
        System.out
                .println("___________________________________________________________________________________________");
    }
}
