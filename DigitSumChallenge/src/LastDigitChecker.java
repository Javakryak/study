public class LastDigitChecker {

    public static boolean hasSameLastDigit (int num1, int num2, int num3){
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int ld1 = num1 % 10;
        int ld2 = num2 % 10;
        int ld3 = num3 % 10;
        if (ld1 == ld2 || ld1 == ld3 || ld3 == ld2){
            return true;
        }
        return false;
    }

    public static boolean isValid (int number){
        return number > 9 && number < 1001;
    }
}
