package vacation;

public class AdventureActivitiesPackageDecorator extends CostDecorator {
    public AdventureActivitiesPackageDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }

    public double getCost() {
        double baseCost = super.getCost();

        double addOnCost = 150.0 * super.getNumberOfTravelers();

        return baseCost + addOnCost;
    }
}
