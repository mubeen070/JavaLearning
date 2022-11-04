
import java.util.Random;

public class dice {
    public static void main(String[] args) {
        int d1;
        int d2;
        int sum = 0;
        int[] arr = new int[11];
        Random rand = new Random();

        for (int i = 0; i < 36000; i++) {
            d1 = 1+rand.nextInt(6);
            d2 = 1+rand.nextInt(6);
            sum = d1 + d2;

            arr[sum - 2]++;

        }
        System.out.println("Sum "+"\tFrequency");
        for (int k = 0; k < arr.length; k++) {
            System.out.printf("%02d :   \t%d\n",k+2,arr[k]);
        }

    }

}