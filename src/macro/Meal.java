package macro;

public class Meal {
    private final Food carb, protein, fat;
    public Meal(Food carb, Food protein, Food fat) {
        this.carb = carb; this.protein = protein; this.fat = fat;
    }
    public void describe(String customerName) {
        System.out.println(customerName + "'s meal: " +
            carb + protein + fat);
    }
}
