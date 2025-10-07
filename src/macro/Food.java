package macro;

public class Food {
    private final String name;
    private final String group;
    public Food(String name, String group) { this.name = name; this.group = group; }
    public String getName() { return name; }
    public String getGroup() { return group; }
    @Override public String toString() { return name; }
}
