package vacation;

import java.util.HashMap;
public class Destination {
    private String name;
    private double additionalCost;
    
    private static final HashMap<String, Double> destinationCosts = new HashMap<String,Double>();

    static {
        destinationCosts.put("Paris", 500.0);
        destinationCosts.put("New York", 600.0);
    }
    
    
    public Destination(String name) {
        Double cost = destinationCosts.getOrDefault(name,0.00);
        this.name = name;
        this.additionalCost = cost;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(int additionalCost) {
        this.additionalCost = additionalCost;
    }

    @Override
    public String toString() {
        return "Destination\nname=" + name + ", additionalCost=" + additionalCost + "";
    }
    
    
    
    
}
