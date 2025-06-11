package coffeeshop;

// Factory class - creates coffee objects
public class CoffeeFactory {

    // Factory method - decides which coffee to create
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> {
                System.out.println("🏭 Creating Espresso");
                yield new Espresso();
            }
            case "latte" -> {
                System.out.println("🏭 Creating Latte");
                yield new Latte();
            }
            default -> {
                System.out.println("❌ Unknown coffee type: " + type);
                yield null;
            }
        };
    }
}