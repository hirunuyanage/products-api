package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){
        super();
    }

    public DigitalProduct(Long id, String name, double price,String downloadUrl){
        super(id,name,price);
        this.downloadUrl =downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }
}