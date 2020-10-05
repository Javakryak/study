package com.artem;

public class Main {

    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        FootballTeam lokomomtiv = new FootballTeam("Lokomotiv", 1, 3, 1);
        FootballTeam cska = new FootballTeam("CSKA", 3, 1, 1);
        FootballTeam spartak = new FootballTeam("Spartak", 2, 3, 0);
        HockeyTeam avangard = new HockeyTeam("Avangard", 9, 3, 2);

        SportsLeague<FootballTeam> rpl = new SportsLeague<>("Tinkoff Russian Premier League");

        rpl.addTeam(lokomomtiv);
        rpl.addTeam(cska);
        rpl.addTeam(spartak);
//        rpl.addTeam(avangard);

        rpl.printRankings();


    }
}
