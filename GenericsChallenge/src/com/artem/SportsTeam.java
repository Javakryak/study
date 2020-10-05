package com.artem;

public abstract class SportsTeam implements Comparable<SportsTeam> {
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private String name;

    public SportsTeam(String name) {
        this.name = name;
    }

    public SportsTeam(String name, int won, int lost, int tied) {
        this.name = name;
        this.won = won;
        this.lost = lost;
        this.tied = tied;
        this.played = won + lost + tied;
    }

    public String getName() {
        return name;
    }

    public int ranking() {
        return won * 3 + tied;
    }

    @Override
    public int compareTo(SportsTeam o) {
        if (this.ranking() > o.ranking()) {
            return -1;
        } else if (this.ranking() < o.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}

