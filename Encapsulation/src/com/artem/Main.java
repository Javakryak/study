package com.artem;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remainnig health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remainnig health = " + player.healthRemaining());
//    }

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
