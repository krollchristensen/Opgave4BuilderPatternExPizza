import java.util.ArrayList;
import java.util.List;

class Pizza
{
    private final String size; // e.g., "small", "medium", "large"
    private final List<String> toppings;
    private final boolean cheese;

    public Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.toppings = builder.toppings;
        this.cheese = builder.cheese;
    }

    public String toString() {
        return "Size: " + size + ", Toppings: " + toppings + ", Cheese: " + cheese;
    }

    public static class PizzaBuilder {
        private String size;
        private final List<String> toppings = new ArrayList<>();
        private boolean cheese;

        public PizzaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}