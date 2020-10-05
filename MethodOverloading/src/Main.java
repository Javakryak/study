public class Main {


    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(150));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("Unnamed player, no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet < 0 || (inches < 0 || inches > 12)){
            return -1;
        } else {
            return feet * 12 * 2.54 + inches * 2.54;
        }
    }
    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches < 0){
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters((int) (inches / 12), inches % 12);
        }
    }
}


