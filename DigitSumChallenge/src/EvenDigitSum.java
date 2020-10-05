public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if (number < 0){
            return -1;
        }
        int evenSum = 0;
        int lastDigit;
        while (number > 0){
            lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0){
                evenSum += lastDigit;
            }
        }
        return evenSum;
    }
}
