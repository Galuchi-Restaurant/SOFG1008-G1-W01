package vacation;

public enum AddOn {
    ALL_INCLUSIVE("All-Inclusive", 200.0),
    ADVENTURE_ACTIVITIES("Adventure Activities", 150.0),
    SPA_AND_WELLNESS("Spa and Wellness", 100.0);

    private final String name;
    private final double price;

    AddOn(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
