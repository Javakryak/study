package com.artem;

import java.util.ArrayList;
import java.util.Collections;

public class SportsLeague<T extends SportsTeam> {

    private ArrayList<T> teamList = new ArrayList<>();
    private String name;

    public SportsLeague(String name) {
        this.name = name;

    }

    public void addTeam(T team) {
        if (teamList.contains(team)) {
            System.out.println(team.getName() + " is already in this league");
        } else {
            teamList.add(team);
            System.out.println(team.getName() + " added to " + name);
        }
    }

    public String getName() {
        return name;
    }

    public void printRankings () {
        Collections.sort(teamList);
        System.out.println (this.name + "\nCurrent team ranking");
        for (int i = 0; i < teamList.size(); i++){
            System.out.println(
                    "#" + (i+1) + " " + teamList.get(i).getName() + " " + teamList.get(i).ranking() + " points");
        }
    }
}
