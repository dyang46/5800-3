import pizza.*;
import macro.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Driver {

    // random helper
    private static final Random RAND = new Random();
    public static void main(String[] args) {

        // run pizzas and costumer tests
        runPizzaDemo();
        System.out.println();
        runMacroDemo();


    }

    // Test all 3 pizza chains and sizes with randomly chosen toppings
    private static void runPizzaDemo() {
        System.out.println("PIZZAS");

        makeRandomPizza(new PizzaHutBuilder(), Size.SMALL);
        makeRandomPizza(new DominosBuilder(), Size.MEDIUM);
        makeRandomPizza(new LittleCaesarsBuilder(), Size.LARGE);
    }

    private static void makeRandomPizza(PizzaBuilder builder, Size size) {
        int numToppings;
        switch (size) {
            case SMALL:  numToppings = 3; break;
            case MEDIUM: numToppings = 5; break;
            case LARGE:  numToppings = 8; break;
            default:     numToppings = 3;
        }


        List<Topping> all = new ArrayList<>(Arrays.asList(Topping.values()));
        Collections.shuffle(all, RAND);
        List<Topping> chosen = all.subList(0, numToppings);

        for (Topping t : chosen) builder.add(t);
        builder.size(size).build().eat();
    }

    private static List<Customer> fromNamesAndPlans(String[] names, DietPlan[] plans) {
        if (names.length != plans.length) throw new IllegalArgumentException("Lengths must match");
        List<Customer> list = new ArrayList<>(names.length);
        for (int i = 0; i < names.length; i++) list.add(new Customer(names[i], plans[i]));
        return list;
}

    // test 6 types of diet plans using 6 cutomers
    private static void runMacroDemo() {
        System.out.println("MACRONUTRIENTS");

        var factory = macro.factory.MacronutrientFactorySingleton.get();

        List<Customer> customers = Arrays.asList(
            new Customer("A", DietPlan.NO_RESTRICTION),
            new Customer("B", DietPlan.PALEO),
            new Customer("C", DietPlan.VEGAN),
            new Customer("D", DietPlan.NUT_ALLERGY),
            new Customer("E", DietPlan.PALEO),
            new Customer("F", DietPlan.VEGAN)
        );

        for (Customer customer : customers) {
            Food c = factory.carb(customer.getDietPlan());
            Food p = factory.protein(customer.getDietPlan());
            Food f = factory.fat(customer.getDietPlan());
            new Meal(c, p, f).describe(customer.getName());
}

    }
}
