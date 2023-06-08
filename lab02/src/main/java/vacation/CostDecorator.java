package vacation;

public abstract class CostDecorator implements VacationPackage {
        protected VacationPackage decoratedPackage;

        public CostDecorator(VacationPackage decoratedPackage) {
            this.decoratedPackage = decoratedPackage;
        }
        
        public int getDuration() {
            return decoratedPackage.getDuration();
        }
        
        public int getNumberOfTravelers() {
            return decoratedPackage.getNumberOfTravelers();
        }
        
        public double getCost() {
            return decoratedPackage.getCost();
        }
        
}