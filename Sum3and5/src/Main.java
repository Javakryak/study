public class Main {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(100, 100));

        int k = 0; // sum of divisible numbers
        int j = 0; // counter
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                j++;
                System.out.println(i + " may be divided by both 3 and 5");
                k = k + i;
                if (j == 5) {
                    System.out.println("Loop ended with 5 numbers found.");
                    break;
                }
            }
        }
        System.out.println("Sum of the numbers are " + k);
    }
}
