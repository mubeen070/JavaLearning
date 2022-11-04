public class TotalSales {
    public static void main(String[] args) {
        int[][] sales = { { 51, 22, 41, 21 }, { 20, 42, 12, 52 }, { 10, 32, 34, 52 }, { 90, 23, 12, 45 },
                { 29, 14, 52, 12 } };
        int[] products = new int[5];
        int[] total = new int[4];
        System.out.printf("%10s%10s%10s%10s%10s%10s\n", "Prod no.", "Per1", "Per2", "Per3", "Per4", "Total");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%10d", i + 1);
            for (int j = 0; j < total.length; j++) {
                System.out.printf("%10d", sales[i][j]);
                products[i] += sales[i][j];
                total[j] += sales[i][j];
            }

            System.out.printf("%10d\n", products[i]);
        
            
        }
        System.out.printf("%10s%10d%10d%10d%10d", "TOTAL:",total[0],total[1],total[2],total[3]);
    }

}// end calculations

// end class sales