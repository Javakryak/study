public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int revNum = reverse(number);
            int origCount = getDigitCount(number);
            int revCount = getDigitCount(revNum);
            while (revNum != 0) {
                switch (revNum % 10) {
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    case 0:
                        System.out.print("Zero ");
                        break;
                }
                revNum /= 10;
            }
            while (origCount > revCount) {
                System.out.print("Zero ");
                origCount--;
            }
        }
    }

    public static int reverse(int numbah) {
        int lastDigit = numbah % 10;
        int reverseNumbah = lastDigit;
        while (numbah < -9 || numbah > 9) {
            reverseNumbah *= 10;
            numbah /= 10;
            lastDigit = numbah % 10;
            reverseNumbah += lastDigit;
        }
        return reverseNumbah;
    }

    public static int getDigitCount(int numbah) {
        if (numbah < 0){
            return -1;
        }
        int digitCount = 1;
        while (numbah > 9) {
            digitCount++;
            numbah /= 10;
        }
        return digitCount;
    }
}
