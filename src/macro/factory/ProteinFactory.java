package macro.factory;

import macro.*;
import macro.util.Rand;
import java.util.*;
import java.util.stream.Collectors;

public final class ProteinFactory {
    private static ProteinFactory instance;
    private ProteinFactory() {}
    public static ProteinFactory get() {
        if (instance == null) instance = new ProteinFactory();
        return instance;
    }

    private static final List<String> ALL = List.of("Fish","Chicken","Lentils","Beef","Tuna","Tofu");

    public Food create(DietPlan plan) {
        List<String> opts = new ArrayList<>(ALL);
        if (plan == DietPlan.PALEO) opts.remove("Tofu");
        if (plan == DietPlan.VEGAN)
            opts = opts.stream().filter(x -> !List.of("Fish","Chicken","Tuna","Beef").contains(x)).collect(Collectors.toList());
        return new Food(Rand.pick(opts), "Protein");
    }
}
