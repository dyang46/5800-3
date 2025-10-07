package macro.factory;

import macro.*;

public abstract class MacronutrientFactory {
    public abstract Food carb(DietPlan plan);
    public abstract Food protein(DietPlan plan);
    public abstract Food fat(DietPlan plan);
}
