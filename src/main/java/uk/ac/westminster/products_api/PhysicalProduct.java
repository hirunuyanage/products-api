package uk.ac.westminster.products_api;

public class PhysicalProduct extends  Product{

    private double weightKg;
    private String dimensions;

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
}