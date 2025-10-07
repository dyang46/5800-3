package macro.factory;

import macro.*;
import macro.util.Rand;
import java.util.*;
import java.util.stream.Collectors;

public final class FatsFactory {
    private static FatsFactory instance;
    private FatsFactory() {}
    public static FatsFactory get() {
        if (instance == null) instance = new FatsFactory();
        return instance;
    }

    private static final List<String> ALL = List.of("Cheese","Avocado","Sour cream","Peanuts","Pistachio");

    public Food create(DietPlan plan) {
        List<String> opts = new ArrayList<>(ALL);
        if (plan == DietPlan.PALEO) opts.removeAll(List.of("Cheese","Sour cream"));
        if (plan == DietPlan.VEGAN) opts.removeAll(List.of("Cheese","Sour cream"));
        if (plan == DietPlan.NUT_ALLERGY) opts.removeAll(List.of("Peanuts","Pistachio"));
        return new Food(Rand.pick(opts), "Fats");
    }
}
