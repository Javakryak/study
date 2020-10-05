public class MethodOverloading  {

    public static void ochko (String args[]) {
        int newScore = calculateScore("Pipidastr", 500);
        System.out.println("New score is " + newScore);
    }
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
}
