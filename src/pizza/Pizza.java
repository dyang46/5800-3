package pizza;

import java.util.*;

public class Pizza {
    private final String chain;
    private final Size size;
    private final List<Topping> toppings;

    Pizza(String chain, Size size, List<Topping> toppings) {
        if (size == null) throw new IllegalStateException("Size is required!");
        this.chain = chain;
        this.size = size;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public void eat() {
        System.out.println(chain + " Pizza (" + size + "): " + toppings);
    }
}
