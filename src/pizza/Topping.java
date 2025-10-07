package pizza;

public enum Topping {
    Pepperoni, Sausage, Mushrooms, Bacon, Onions, Extra_Cheese, Peppers, Chicken,
    Olives, Spinach, Tomato_and_Basil, Beef, Ham, Pesto, Spicy_Pork, Ham_and_Pineapple;

    @Override public String toString() { return name().replace('_', ' '); }
}
