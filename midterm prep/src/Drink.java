public class Drink extends MenuItem {
    private double volume;

    public Drink(String name, String code, double price, double volume) {
        super(name, code, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getDescription() {
        return getName() + " " + getVolume() + "ml" + " Price: " + getPrice();
    }
}


