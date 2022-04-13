public class TestResult {
    public static void main(String[] args) {
        Result objResult =new Result();
        objResult.input();
        objResult.show();
        System.out.println("Total marks of subject: "+objResult.totall());
        System.out.println("\nAverage is :"+objResult.avg());

    }
}
