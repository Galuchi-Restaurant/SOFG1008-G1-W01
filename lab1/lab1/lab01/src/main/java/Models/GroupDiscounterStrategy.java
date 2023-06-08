package com.espol.workshop;
import com.espol.workshop.DiscounterStrategy;

public class GroupDiscounterStrategy implements DiscounterStrategy {
    private int numOfTravelers;
    
    public GroupDiscounterStrategy(int numOfTravelers) {
        this.numOfTravelers = numOfTravelers;
    }
    
    @Override
    public double applyDiscount(double cost) {
        if (numOfTravelers > 4 && numOfTravelers < 10) {
            return cost * 0.9;  // 10% discount
        } else if (numOfTravelers > 10) {
            return cost * 0.8;  // 20% discount
        }else if (numOfTravelers == 2) {
            return cost - 200;
        }else {
            return cost;
        }
    }
    
}
