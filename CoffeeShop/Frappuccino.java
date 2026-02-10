package CoffeeShop;

public class Frappuccino extends Drink{
    private boolean whipped;
    public Frappuccino (String size,boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }
    @Override
    public double calculateFinalPrice() {
        return getBaseprice() + (whipped ? + 15:0) + getSizeExtra();
    }
    public String toString() {
        return super.toString() + (whipped ? "\nAdded whipped 15 Baht" + whipped : " ") + "\nTotal price = "
                + calculateFinalPrice() + " Baht";
    }
}
