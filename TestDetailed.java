


public class TestDetailed {
    public static void main(String[] args) {
        
        DetailedMarkSheet obj1 = new DetailedMarkSheet("Mubeen", "Khalid", "Gujranwala", "BSE", 15);
        obj1.subjectInfo();
        if (obj1.test == 0) {
            obj1.totalScore();
            obj1.percentage();
            obj1.Diplay();
            obj1.computeGrade();
        }
        
    }
}
