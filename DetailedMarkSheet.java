public class DetailedMarkSheet
{
    private String student_Name;
    private String student_FatherName;
    private String Address;
    private String Class; 
    private int rollNo;
    private String[] subjects;
    private int[] totalMarks ;
    private double[] obtMarks;
    private int totalSub;
    public void setStudent_Name(String sn){
        this.student_Name = sn;
    }
    public void setStudent_FName(String sfn){
        this.student_FatherName = sfn;
    }
    public void setAddress(String a){
        this.Address = a;
    }
    public void setClass(String c){
        this.Class = c;
    }
    public void setRollNo(int rn){
        this.rollNo = rn;
    }
    public void setTotalSubj(int ts){
        this.totalSub=ts;
    }
    public int getTotalSubj(){
        return totalSub;
    }
    public void setSubjects(String[] s){
        this.subjects = s;
    }
    public void setTotalMarks(int[] tm){
        this.totalMarks = tm;
    }
    public void setObtMarks(double[] obtm){
        this.obtMarks = obtm;
    }
    public void Diplay(){
        System.out.println("\n"+student_Name+"\n"+student_FatherName+"\n"+Address+"\n"+Class+"\n"+rollNo);
        for(int k=0; k<totalSub; k++){
            System.out.println(subjects[k]);
        }
        for(int i=0 ; i<totalSub;i++){
            System.out.println(totalMarks[i]);
        }
        for(int j=0; j<totalSub; j++){
            System.out.println(obtMarks[j]);
        }
    }
}
