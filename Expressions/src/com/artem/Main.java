package com.artem;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000, but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("You're loser");
//        } else {
//            System.out.println("something else");
//        }
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        if (gameOver == true) {
            score = 10000;
            levelCompleted = 0;
            bonus = 200;
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score is " + secondScore);
        }
    }
}
