public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2){
        int dti1 = (int) (num1 * 1000);
        int dti2 = (int) (num2 * 1000);
        return dti1 == dti2;
    }
}
