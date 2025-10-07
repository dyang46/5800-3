package macro.factory;

import macro.*;
import macro.util.Rand;
import java.util.*;
import java.util.stream.Collectors;

public final class CarbsFactory {
    private static CarbsFactory instance;
    private CarbsFactory() {}
    public static CarbsFactory get() {
        if (instance == null) instance = new CarbsFactory();
        return instance;
    }

    private static final List<String> ALL = List.of("Bread","Lentils","Pistachio");

    public Food create(DietPlan plan) {
        List<String> opts = new ArrayList<>(ALL);
        if (plan == DietPlan.PALEO) opts = List.of("Pistachio");
        if (plan == DietPlan.NUT_ALLERGY)
            opts = opts.stream().filter(x -> !"Pistachio".equals(x)).collect(Collectors.toList());
        return new Food(Rand.pick(opts), "Carbs");
    }
}
