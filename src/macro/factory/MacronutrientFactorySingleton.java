package macro.factory;

import macro.*;

public final class MacronutrientFactorySingleton extends MacronutrientFactory {
    private static MacronutrientFactorySingleton instance;

    private final CarbsFactory carbs = CarbsFactory.get();
    private final ProteinFactory proteins = ProteinFactory.get();
    private final FatsFactory fats = FatsFactory.get();

    private MacronutrientFactorySingleton() {}

    public static MacronutrientFactorySingleton get() {
        if (instance == null) instance = new MacronutrientFactorySingleton();
        return instance;
    }

    @Override public Food carb(DietPlan p)    { return carbs.create(p); }
    @Override public Food protein(DietPlan p) { return proteins.create(p); }
    @Override public Food fat(DietPlan p)     { return fats.create(p); }
}
