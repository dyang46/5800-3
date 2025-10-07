package macro;

public class Customer {
    private final String name;
    private final DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    @Override
    public String toString() {
        return name + " (" + dietPlan + ")";
    }
}
