package pizza;

public class PizzaHutBuilder extends PizzaBuilder {
    public PizzaHutBuilder() { super("Pizza Hut"); }
    @Override public Pizza build() { return new Pizza("Pizza Hut", size, toppings); }
}
