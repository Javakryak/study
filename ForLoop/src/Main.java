public class Main {
    public static void main(String[] args) {
//for (int i = 0; i < 5; i++) {
//    System.out.println("Loop " + i + " hello!");
//}

//        for (int i = 8; i > 1; i--) {
//            System.out.println("10,000$ at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

        int k = 0;
        for (int i = 3; i < 20; i++) {
            if (isPrime(i)) {
                k++;
                System.out.println(k + " prime value found = " + i);
                if (k==3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }
}
