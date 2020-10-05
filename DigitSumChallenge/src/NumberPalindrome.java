public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        int startingNumber = number;
        int reverseNumber = 0;
        int lastDigit;

        while (number != 0) {
            lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        }
        return reverseNumber == startingNumber;
    }
}
