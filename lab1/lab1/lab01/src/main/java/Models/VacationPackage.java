package com.espol.workshop;
import com.espol.workshop.DiscounterStrategy;

/*
 * Author: team 1
 * */
public class VacationPackage {
    private Destination destination;
    private int travelers;
    private int durationDays;
    private final double BASEPRICE = 1000.0;
    private int numOfTravelers;
    private DiscounterStrategy discountStrategy;
    
    public VacationPackage(Destination destination, int duration, int numOfTravelers) {
        this.destination = destination;
        this.durationDays = durationDays;
        this.numOfTravelers = numOfTravelers;
    }
    
    public boolean validate(){
        if (numOfTravelers < 1 || numOfTravelers > 80) {
            return false;
        }

        // Validate the duration
        if (durationDays < 1) {
            return false;
        }

        return true;
        
    }
    
    public double getTotalCost() {
        double extraCost = destination.getExtraCost();
        return BASEPRICE + extraCost;
    }
    
    public DiscounterStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscounterStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /*
     * Get Destination
     * */
    public String getDestination() {
        return destination;
    }
    /*
     * Set Destination
     * */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    /*
     * Get Travelers
     * */
    public int getTravelers() {
        return travelers;
    }
    /*
     * Set Travelers
     * */
    public void setTravelers(int travelers) {
        this.travelers = travelers;
    }
    /*
     * Get Duration Days
     * */
    public int getDurationDays() {
        return durationDays;
    }
    /*
     * Set Duration Days
     * */
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

}
