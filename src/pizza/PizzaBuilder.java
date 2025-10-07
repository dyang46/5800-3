package pizza;

import java.util.*;

public abstract class PizzaBuilder {
    protected final String chain;
    protected Size size;
    protected final List<Topping> toppings = new ArrayList<>();

    protected PizzaBuilder(String chain) { this.chain = chain; }
    public PizzaBuilder size(Size s) { this.size = s; return this; }
    public PizzaBuilder add(Topping t) { toppings.add(t); return this; }

    public abstract Pizza build();
}
