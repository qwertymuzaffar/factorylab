package coffeeshop;

public class Cappuccino implements Coffee {
    @Override
    public void brew() { System.out.println("☕ Making Cappuccino with foam art"); }

    @Override
    public double getPrice() { return 3.25; }
}
