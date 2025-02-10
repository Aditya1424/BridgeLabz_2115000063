import java.util.*;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}


class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.1; 
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 10% on Veg Items";
    }
}


class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_SURCHARGE = 1.2;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * NON_VEG_SURCHARGE;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: 5% on Non-Veg Items";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(List<FoodItem> order) {
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountItem = (Discountable) item;
                System.out.println(discountItem.getDiscountDetails());
                System.out.println("Discount Applied: " + discountItem.applyDiscount());
                System.out.println("Final Price: " + (item.calculateTotalPrice() - discountItem.applyDiscount()));
            }
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Tikka", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));

        processOrder(order);
    }
}
