import java.util.ArrayList;
public class University {
    public static void main(String[] args) {
int[] number1={23,24,22};
int[] number2={19,24,20};
int[] number3={25,18,22};
int[] number4={12,20,17};
int[] number5={15,20,23};
Student s1=new Student("ALi",034,number1);
Student s2=new Student("AHmad",044,number2);
ArrayList<Student> d1_Student=new ArrayList<Student>();
d1_Student.add(s1);
d1_Student.add(s2);
Department d1=new Department("Computer Science","BTN",d1_Student);
System.out.println(d1.toString()); 
Student s3=new Student("Hamza",010,number3);
Student s4=new Student("Nouman",011,number4);
Student s5=new Student("Omer",016,number5);
ArrayList<Student> d2_Student=new ArrayList<Student>();
d2_Student.add(s3);
d2_Student.add(s4);
d2_Student.add(s5);
Department d2=new Department("Computer Science","BCS",d2_Student);
        System.out.println(d2.toString());
}

}