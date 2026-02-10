package CoffeeShop;

public abstract class Drink {
    private String drinkName;
    private double baseprice;
    private String size;

    public Drink(String drinkName, double baseprice, String size) {
        this.drinkName = drinkName;
        this.baseprice = baseprice;
        this.size = size;

    }

    public double getBaseprice() {

        return baseprice;
    }

    public double getSizeExtra() {
        if (size.equalsIgnoreCase("S")) {
            return 0;
        } else if (size.equalsIgnoreCase("M")) {
            return 15;
        } else if (size.equalsIgnoreCase("L")) {
            return 20;
        } else return -1;
    }

    public abstract double calculateFinalPrice();

    @Override
    public String toString() {
        return "Your order. " + drinkName + " (Size : " + size + ")";
    }
}



