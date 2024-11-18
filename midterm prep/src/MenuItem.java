public abstract class MenuItem implements Billable {

    private String name;
    private String code;
    private double price;
    private double discountRate;


    public MenuItem(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.discountRate = discountRate;

    }

    public double applyDiscount(double discountRate) {
        if (discountRate > 0)
            return getPrice() * (1 - (discountRate / 100));
        return getPrice();
    }

    public double applyDiscount() {
        return applyDiscount(this.discountRate);
    }

    public String getDescription()
    {
        return "Item: " + getName() + " Price: " + getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
