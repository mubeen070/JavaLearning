import java.util.Scanner;
class Result{
    Scanner inp=new Scanner(System.in);
    String name;
    String rollNo;
    int marks[]=new int[3];
    void input(){

        System.out.println("\nstudent name");
        name=inp.next();
        System.out.println("\nroll no of student");
        rollNo=inp.next();

        System.out.println("\nsubject marks");
        for (int i=0; i< marks.length; i++){

            marks[i]=inp.nextInt();
        }
    }
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Roll NO : "+rollNo);
        System.out.println("Marks of subjects");
        for (int i=0; i< marks.length; i++){

            System.out.println(marks[i]);
        }


    }
    int totall(){
        int temp=0;
        for (int i=0; i<marks.length; i++){
            temp+=marks[i];

        }

        return temp;

    }

    double avg(){
        int temp=0;
        for (int i=0; i<marks.length; i++){
            temp+=marks[i];

        }
        double ave=temp/3;
        return ave;

    }

}