package vacation;

public class DurationPenaltyDecorator extends CostDecorator{
    private static final double PENALTYFEE = 200.0;
    private static final int DURATIONTHRESHOLD = 7;

    public DurationPenaltyDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }
    
    public double getCost() {
        double cost = super.getCost();
        int duration = super.getDuration();

        if (duration < DURATIONTHRESHOLD) {
            cost += PENALTYFEE;
        } else if (duration > 30 || super.getNumberOfTravelers() == 2) {
            cost -= PENALTYFEE;
        }
        return cost;
    }
    

}
