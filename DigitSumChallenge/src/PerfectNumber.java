public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                divSum += i;
            }
        }
        return divSum == number;
    }
}
