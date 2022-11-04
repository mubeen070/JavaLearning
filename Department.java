import java.util.ArrayList;

public class Department {
    private String departname;
    private String name;
    private ArrayList<Student> student;
    static int count;
      public Department(String departname, String name, ArrayList<Student> student) {
        this.departname = departname;
        this.name = name;
        this.student = student;
        count=0;
    }

    public String toString() {
        String str = "";
        for (Student b : student) {
            str += b;
        }
        return "\nDepartmentName= " + departname + "\nTotal Students Enrolled " + student.size() +
                "\nProgram= " + name + "\n" + str;
    }

}