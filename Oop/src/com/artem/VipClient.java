package com.artem;

public class VipClient {
    private String name;
    private double creditLimit;
    private String email;

    public VipClient(){
        this("VipClient", 10000.0d, "default@ema.il");
    }

    public VipClient(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipClient (String name, double creditLimit){
        this(name, creditLimit, "default@ema.il");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
