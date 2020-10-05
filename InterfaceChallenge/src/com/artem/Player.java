package com.artem;

import java.util.ArrayList;

public class Player implements ISavable {
    private String playerName;
    private int playerHealth;
    private String currentLevel;

    @Override
    public ArrayList<String> write() {
        ArrayList<String> playerData = new ArrayList<String>();
        playerData.add(0, this.playerName);
        playerData.add(1,"" + playerHealth);
        playerData.add(2, currentLevel);
        return playerData;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0){
            this.playerName = savedValues.get(0);
            this.playerHealth = Integer.parseInt(savedValues.get(1));
            this.currentLevel = savedValues.get(2);
        }
    }

    @Override
    public String toString() {
        return playerName + "\nHP: " + playerHealth + "\nLevel: " + currentLevel;
    }

    public Player(String playerName, int playerHealth, String currentLevel) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.currentLevel = currentLevel;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(String currentLevel) {
        this.currentLevel = currentLevel;
    }
}
