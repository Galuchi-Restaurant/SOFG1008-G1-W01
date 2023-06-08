package com.espol.workshop;

public class LongStayDiscountStrategy implements DiscountStrategy{
    private int duration;

    public LongStayDiscountStrategy(int duration) {
        this.duration = duration;
    }

    @Override
    public double applyDiscount(double cost) {
        if (duration < 7){
        return cost + 200;
        }else if (duration > 30) {
            return cost - 200;  
        } else {
            return cost;
        }
    }


}
