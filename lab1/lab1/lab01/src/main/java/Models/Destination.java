package com.espol.workshop;

public class Destination {
    private String name;
    private double extraCost;
    
    public Destination(String name, double extraCost) {
        this.name = name;
        this.extraCost = extraCost;
    }

    public String getName() {
        return name;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
