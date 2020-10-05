package com.artem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


   public static void main(String[] args) {

       FootballPlayer joe = new FootballPlayer("Joe");
       BaseballPlayer petya = new BaseballPlayer("Petya");
       SoccerPlayer vasya = new SoccerPlayer("Vasya");

       Team<FootballPlayer> poleno = new Team<>("Moscow Sticks");

       poleno.addPlayer(joe);
//       poleno.addPlayer(petya);
//       poleno.addPlayer(vasya);

       System.out.println(poleno.numPlayers());

       Team<BaseballPlayer> baseballTeam = new Team<>("Sizyi Shar");
       baseballTeam.addPlayer(petya);

       Team<SoccerPlayer> cska = new Team<>("CSKA");
       Team<SoccerPlayer> parovoz = new Team<>("Loko");
       Team<SoccerPlayer> spartak = new Team<>("Spartak");
       SoccerPlayer miranchuk = new SoccerPlayer("Miranchuk");
       cska.addPlayer(vasya);
       parovoz.addPlayer(miranchuk);
       cska.matchResult(parovoz, 2, 1);
       cska.matchResult(spartak, 3, 3);
       spartak.matchResult(cska, 1, 3);
//       spartak.matchResult(baseballTeam, 0,5);

       System.out.println("Rankings");

       System.out.println(parovoz.getName() + ": " + parovoz.ranking());
       System.out.println(spartak.getName() + ": " + spartak.ranking());
       System.out.println(cska.getName()+ ": " + cska.ranking());

       System.out.println(cska.compareTo(parovoz));
       System.out.println(cska.compareTo(spartak));


       ArrayList<Team> teams = new ArrayList<>();
       teams.add(parovoz);
       teams.add(cska);
       teams.add(spartak);
       Collections.sort(teams);
       /*
	// обычный эррейлист
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList n){
        for (Object i : n){
            System.out.println((Integer) i * 2);
        }*/
    }
}
