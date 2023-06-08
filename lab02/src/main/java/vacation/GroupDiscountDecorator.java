package vacation;

public class GroupDiscountDecorator extends CostDecorator{
    private static final int GROUP_SIZE_THRESHOLD_1 = 4;
    private static final int GROUP_SIZE_THRESHOLD_2 = 10;
    private static final double GROUP_DISCOUNT_1 = 0.1;
    private static final double GROUP_DISCOUNT_2 = 0.2;

    
    public GroupDiscountDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }
    
    public double getCost(){
        double cost = super.getCost();
        int numberOfTravelers = super.getNumberOfTravelers();

        if (numberOfTravelers > GROUP_SIZE_THRESHOLD_1 && numberOfTravelers <= GROUP_SIZE_THRESHOLD_2) {
            cost -= cost * GROUP_DISCOUNT_1;
        } else if (numberOfTravelers > GROUP_SIZE_THRESHOLD_2) {
            cost -= cost * GROUP_DISCOUNT_2;
        }

        return cost;
        
    } 

}
