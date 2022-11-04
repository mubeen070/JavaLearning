//import java.util.ArrayList;

public class Student {
    private String name;
    private int regno;
    private int[] marks;
    int total=0;
    public Student(String name, int regno, int[] marks) {
        this.name = name;
        this.regno = regno;
        this.marks = marks;
    }
    
    
    public String toString() {
        String str = "";
        int total=0;
        for (int b : marks) {
            total+=b;
            str += b;
            str += "\t";
        }
            return String.format("\n\nStudent# " + ++Department.count+ "\nName= " + name +
                "\nReg_no= " + regno + "\n\tTest1\tTest2\tTest3" + "\nGrades= " + str +"Grades Total= " + total);
    }
}
