public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }
        int ldnum1 = num1 % 10;
        int fdnum1 = num1 / 10;
        int ldnum2 = num2 % 10;
        int fdnum2 = num2 / 10;
        return ldnum1 == ldnum2 || ldnum1 == fdnum2 ||
                fdnum1 == ldnum2 || fdnum1 == fdnum2;
    }
}
