package vacation;

public class AllInclusivePackageDecorator extends CostDecorator {

    public AllInclusivePackageDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }
    
    public double getCost() {
        double baseCost = super.getCost();

        double addOnCost = 200.0 * super.getNumberOfTravelers();

        return baseCost + addOnCost;
    }
}