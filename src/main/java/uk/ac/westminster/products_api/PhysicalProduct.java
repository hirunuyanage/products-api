package uk.ac.westminster.products_api;

public class PhysicalProduct extends  Product implements Discountable{

    private double discountedPrice;
    private double weightKg;
    private String dimensions;

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public PhysicalProduct(){
        super();
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public String getDimensions(){
        return dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }

    @Override
    public String getSummary(){
        return "Physical Product :" + getName() +
                " | Weight : "  + getWeightKg();
    }
}