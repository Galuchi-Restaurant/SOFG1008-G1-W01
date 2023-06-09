package vacation;

public class GroupDiscountDecorator extends CostDecorator{
    private static final int SIZE_MIN_LIMIT = 4;
    private static final int SIZE_MAX_LIMIT = 10;
    private static final double GROUP_DISCOUNT_1 = 0.1;
    private static final double GROUP_DISCOUNT_2 = 0.2;

    
    public GroupDiscountDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }
    
    public double getCost(){
        double cost = super.getCost();
        int numberOfTravelers = super.getNumberOfTravelers();

        if (numberOfTravelers > SIZE_MIN_LIMIT && numberOfTravelers <= SIZE_MAX_LIMIT) {
            cost -= cost * GROUP_DISCOUNT_1;
        } else if (numberOfTravelers > SIZE_MAX_LIMIT) {
            cost -= cost * GROUP_DISCOUNT_2;
        }

        return cost;
        
    } 

}
