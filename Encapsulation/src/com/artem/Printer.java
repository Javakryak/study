package com.artem;

public class Printer {
    private String modelName;
    private double tonerLevel = 100;
    private int pagesCountTotal;
    private int pagesSinceLastRecharge = 0;
    private int duplex = 0;

    public Printer(String modelName, double tonerLevel, int pagesCount, int pagesSinceLastRecharge,int duplex) {
        this.modelName = modelName;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesCountTotal = pagesCount;

        if (duplex == 1) {
            this.duplex = duplex;
        }

        if (pagesSinceLastRecharge > 0 && pagesSinceLastRecharge <= 5000){
            this.pagesSinceLastRecharge = pagesSinceLastRecharge;
        }
    }

    public void rechargeToner (double toner) {
        if (toner < 1){
            System.out.println("Incorrect number");
        } else if (toner + this.tonerLevel > 100d){
            this.tonerLevel = 100d;
            System.out.println("Toner fully charged");
        } else {
            this.tonerLevel += toner;
            System.out.println("Toner charged, current level " + (int)this.tonerLevel + "%");
        }
    }

    public void Print (int pages) {
        if ((double)pages / 50 > this.tonerLevel) {
            this.pagesCountTotal += pages;
            this.tonerLevel -= (double) pages / 50;
            System.out.println(pages + " pages printed");
        } else {
            System.out.println("Not enough toner. Please recharge.");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void getTonerLevel() {
        System.out.println("Current toner level is " + (int)tonerLevel + "%");
    }

    public int getPagesCountTotal () {
        return pagesCountTotal;
    }

    public void getPagesCount(){

    }

    public void getDuplex() {
        if (this.duplex == 1) {
            System.out.println("Duplex printing are supported.");
        } else {
            System.out.println("Duplex printing aren't supported.");
        }
    }
}
