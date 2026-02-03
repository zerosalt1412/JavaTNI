public class BubbleTea extends Bakery{
    private int topping;

    public BubbleTea (int topping, String flavor, double unitPrice){
        super(flavor, unitPrice);
        this.topping = topping;
    }

    public int gettoppingPrice() {
        return topping * 10;
    }

    @Override
    public double calculateTotalPrice(){
        return getUnitPrice() + gettoppingPrice();
    }
    @Override
    public String toString() {
        return super.toString() + "\nBubble Tea(" + getFlavor() + ") topping" + topping +
                "\nTotal price of Bubble Tea = " + calculateTotalPrice();
    }
}
