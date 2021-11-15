public abstract class Hardware implements ComputerComponent {
    private String name;
    private String brandName;
    private String componentType = "Hardware";
    private String IOType;
    private double price;

    // Setters
    protected void setName(String name) {
        this.name = name;
    }

    protected void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    protected void setIOType(String IOType) {
        this.IOType = IOType;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getComponentType() {
        return this.componentType;
    }

    public String getIOType() {
        return this.IOType;
    }

    public double getPrice() {
        return this.price;
    }
    
}
