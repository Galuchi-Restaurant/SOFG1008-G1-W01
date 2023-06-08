package com.espol.workshop;
import com.espol.workshop.VacationPackage;

public class VacationCalculator {
    
    public double calculate(VacationPackage vacationPackage){
        if (!vacationPackage.validate()) {
            return -1;
        }
        
        
        double totalCost = vacationPackage.getTotalCost();
        
        totalCost = vacationPackage.getDiscounterStrategy().applyDiscount(totalCost);
        
    }
    

}
