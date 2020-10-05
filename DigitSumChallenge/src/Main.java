public class Main {
    public static void main(String[] args) {
        NumberToWords.numberToWords(323);

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);
                number /= 10;
            }
            return sum;

    }
}