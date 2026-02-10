package CoffeeShop;

public class Espresso extends Drink{
    private int shot;

    public Espresso (String size){
        super("Espresso", 35, size);
        this.shot = 0;
    }
    public void addShot(int shot){
        this.shot += this.shot;
    }

    public int getShot() {
        return shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBaseprice() + (shot * 15) + getSizeExtra();
    }
    public String toString() {
        return super.toString() + (getShot() > 0? "\nAdded " + getShot() + "shot " : " ") + "\nTotal price = "
                + calculateFinalPrice() + " Baht";
    }
}
