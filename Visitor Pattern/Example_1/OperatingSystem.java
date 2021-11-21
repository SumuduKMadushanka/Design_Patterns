public class OperatingSystem extends Software {
    private String OSType;
    // System requirements
    private String requiredProcessor;
    private int requiredRAM;
    private int requiredStorage;

    public OperatingSystem(String name, String OSType, String requiredProcessor, int requiredRAM, int requiredStorage) {
        this.setName(name);
        this.setSoftwareType("Operating System");

        this.OSType = OSType;
        this.requiredProcessor = requiredProcessor;
        this.requiredRAM = requiredRAM;
        this.requiredStorage = requiredStorage;
    }

    // Getters
    public String getOSType() {
        return this.OSType;
    }

    public String getRequiredProcessor() {
        return this.requiredProcessor;
    }

    public int getRequiredRAM() {
        return this.requiredRAM;
    }

    public int getRequiredStorage() {
        return this.requiredStorage;
    }

    // Print Attributes
    public void printName() {
        System.out.println("Name: " + this.getName());
    }

    public void printOSType() {
        System.out.println("OS Type: " + this.getOSType());
    }

    public void printRequiredProcessor() {
        System.out.println("Required Processor: " + this.getRequiredProcessor());
    }

    public void printRequiredRAM() {
        System.out.println("Required RAM: " + this.getRequiredRAM() + " GB");
    }

    public void printRequiredStorage() {
        System.out.println("Required Storage: " + this.getRequiredStorage() + " GB");
    }

    @Override
    public void printDetails(){
        System.out.println("---- Print " + this.getSoftwareType() + " Details ----");
        printName();
        printOSType();

        System.out.println("System requirements");
        printRequiredProcessor();
        printRequiredRAM();
        printRequiredStorage();
    }
    
}
