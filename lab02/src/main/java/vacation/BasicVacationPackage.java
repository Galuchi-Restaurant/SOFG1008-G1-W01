package vacation;

public class BasicVacationPackage implements VacationPackage{
    private static final double BASECOST = 1000;
    private final Destination destination;
    private final int numberOfTravelers;
    private final int duration;
    
    public BasicVacationPackage(Destination destination, int numberOfTravelers, int duration) {
        this.destination = destination;
        this.numberOfTravelers = numberOfTravelers;
        this.duration = duration;

    }
    
    public double getBaseCost() {
        return BASECOST;
    }

    public Destination getDestination() {
        return destination;
    }
    
    public int getNumberOfTravelers() {
        return numberOfTravelers;
    }

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        // TODO Auto-generated method stub
        return BASECOST + destination.getAdditionalCost();
    }
    @Override
    public String toString() {
        return "BasicVacationPackage [destination=" + destination + ", numberOfTravelers=" + numberOfTravelers
                + ", duration=" + duration +"]";
    }
    
    
    

}
