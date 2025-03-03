public class Meal {
    private String appetizer;
    private String mainCourse;
    private String sideDish;
    private String dessert;

    // Private constructor to prevent direct object creation
    private Meal(MealBuilder builder) {
        this.appetizer = builder.appetizer;
        this.mainCourse = builder.mainCourse;
        this.sideDish = builder.sideDish;
        this.dessert = builder.dessert;
    }

    // Overriding toString method to print meal details
    @Override
    public String toString() {
        return "Meal{" +
                "Appetizer='" + appetizer + '\'' +
                ", Main Course='" + mainCourse + '\'' +
                ", Side Dish='" + sideDish + '\'' +
                ", Dessert='" + dessert + '\'' +
                '}';
    }

    // MealBuilder - The Builder Class
    public static class MealBuilder {
        private String appetizer;
        private String mainCourse;
        private String sideDish;
        private String dessert;

        // Set appetizer
        public MealBuilder setAppetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }

        // Set main course
        public MealBuilder setMainCourse(String mainCourse) {
            this.mainCourse = mainCourse;
            return this;
        }

        // Set side dish
        public MealBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        // Set dessert
        public MealBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        // Build the meal
        public Meal build() {
            return new Meal(this);
        }
    }

    // Main Method to test the code
    public static void main(String[] args) {
        // Create a meal using the MealBuilder
        Meal meal = new Meal.MealBuilder()
                .setAppetizer("Caesar Salad") // Set appetizer
                .setMainCourse("Grilled Chicken") // Set main course
                .setSideDish("Mashed Potatoes") // Set side dish
                .setDessert("Chocolate Cake") // Set dessert
                .build();

        // Print the meal details
        System.out.println(meal);
    }
}