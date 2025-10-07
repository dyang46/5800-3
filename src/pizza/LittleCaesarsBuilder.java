package pizza;

public class LittleCaesarsBuilder extends PizzaBuilder {
    public LittleCaesarsBuilder() { super("Little Caesars"); }
    @Override public Pizza build() { return new Pizza("Little Caesars", size, toppings); }
}
