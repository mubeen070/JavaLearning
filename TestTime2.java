public class TestTime2 {
    public static void main(String[] args) {

        time2 t1 = new time2(11, 25, 42);

        System.out.println("t1: hour, minute and second specified\nOriginal:");
        System.out.printf(" %s\n", t1.toUniversalString());
        System.out.printf(" %s\n", t1.toString());


        for (int i = 1; i <= 62; i++) {
            t1.tick();
        }
        System.out.println("t1: after 62 seconds:");
        System.out.printf(" %s\n", t1.toString());

        for (int i = 1; i <= 42; i++) {
            t1.incrementMinute();
        }
        System.out.println("t1: after 42 minutes:");
        System.out.printf(" %s\n", t1.toString());

        for (int i = 1; i <= 12; i++) {
            t1.incrementHour();
        }
        System.out.println("t1: after half day:");
        System.out.printf(" %s\n", t1.toString());

        t1.setSecond(59);
        t1.setMinute(59);
        t1.setHour(23);
        System.out.println("t1: Reset to 23:59:59:");
        System.out.printf(" %s\n", t1.toString());
        t1.tick();
        System.out.println("t1: after one second:");
        System.out.printf(" %s\n", t1.toString());

    }

}
