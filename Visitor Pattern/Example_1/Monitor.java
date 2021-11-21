public class Monitor extends Hardware {
    private Display display;

    private int displayPorts;
    private int HDMIPorts;
    private int USBPorts;

    private int powerConsumption;
    private int voltage;
    private int hightAdjustment;

    public Monitor(String brandName, Display display, int displayPorts, int HDMIPorts, int USBPorts, int powerConsumption, int voltage, int hightAdjustment, double price) {
        this.setName("Monitor");
        this.setBrandName(brandName);
        this.setIOType("Output");

        this.display = display;

        this.displayPorts = displayPorts;
        this.HDMIPorts = HDMIPorts;
        this.USBPorts = USBPorts;

        this.powerConsumption = powerConsumption;
        this.voltage = voltage;
        this.hightAdjustment = hightAdjustment;

        this.setPrice(price);
    }

    // Getters
    public Display getDisplay() {
        return this.display;
    }


    public int getDisplayPorts() {
        return this.displayPorts;
    }

    public int getHDMIPorts() {
        return this.HDMIPorts;
    }

    public int getUSBPorts() {
        return this.USBPorts;
    }


    public int getPowerConsumption() {
        return this.powerConsumption;
    }

    public int getVoltage() {
        return this.voltage;
    }

    public int getHightAdjustment() {
        return this.hightAdjustment;
    }
    
    // Print Attributes
    public void printDisplayPorts() {
        System.out.println("DisplayPorts: " + this.getDisplayPorts());
    }

    public void printHDMIPorts() {
        System.out.println("HDMIPorts: " + this.getHDMIPorts());
    }

    public void printUSBPorts() {
        System.out.println("USBPorts: " + this.getUSBPorts());
    }

    
    public void printPowerConsumption() {
        System.out.println("PowerConsumption: " + this.getPowerConsumption());
    }

    public void printVoltage() {
        System.out.println("Voltage: " + this.getVoltage());
    }

    public void printHightAdjustment() {
        System.out.println("HightAdjustment: " + this.getHightAdjustment());
    }

    @Override
    public void printDetails() {
        System.out.println("---- Print Monitor Details ----");
        System.out.println("Brand Name: " + this.getBrandName());
        this.display.printDisplay();

        printDisplayPorts();
        printHDMIPorts();
        printUSBPorts();

        printPowerConsumption();
        printVoltage();
        printHightAdjustment();

        System.out.println("Price: " + this.getPrice());
    }
}
