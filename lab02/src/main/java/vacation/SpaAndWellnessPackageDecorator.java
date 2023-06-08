package vacation;

public class SpaAndWellnessPackageDecorator extends CostDecorator {
    public SpaAndWellnessPackageDecorator(VacationPackage decoratedPackage) {
        super(decoratedPackage);
    }

    public double getCost() {
        double baseCost = super.getCost();

        double addOnCost = 100.0 * super.getNumberOfTravelers();

        return baseCost + addOnCost;
    }
}
