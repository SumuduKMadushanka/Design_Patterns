public abstract class Software implements ComputerComponent {
    private String name;
    private String softwareType;
    private String componentType = "Software";
    
    // Setters
    protected void setName(String name) {
        this.name = name;
    }

    protected void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    
    public String getSoftwareType() {
        return this.softwareType;
    }
    
    public String getComponentType() {
        return this.componentType;
    }
    
}
