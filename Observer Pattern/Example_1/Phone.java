public class Phone {
    private String phoneName;
    private String brandName;
    private double price;
    
    public Phone(String phoneName, String brandName, double price) {
        this.phoneName = phoneName;
        this.brandName = brandName;
        this.price = price;
    }

    // Getters
    public String getPhoneName() {
        return this.phoneName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public double getPrice() {
        return this.price;
    }

    // Print Details
    public void printDetails() {
        System.out.println("Brand: " + brandName + "\tPhone: " + phoneName + "\tPrice: " + price);
    }

}
