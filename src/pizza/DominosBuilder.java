package pizza;

public class DominosBuilder extends PizzaBuilder {
    public DominosBuilder() { super("Dominos"); }
    @Override public Pizza build() { return new Pizza("Dominos", size, toppings); }
}
