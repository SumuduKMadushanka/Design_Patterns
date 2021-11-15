public class Display {
    private int panelSize;
    private String aspectRatio;
    private String panelType;
    private String panelBacklite;
    private String resolution;
    private String displaySurface;
    private int responseTime;
    private boolean flickerFree;
    private int refreshRate;

    public Display(int panelSize,
        String aspectRatio,
        String panelType,
        String panelBacklite,
        String resolution,
        String displaySurface,
        int responseTime,
        boolean flickerFree,
        int refreshRate)
    {
        this.panelSize = panelSize;
        this.aspectRatio = aspectRatio;
        this.panelType = panelType;
        this.panelBacklite = panelBacklite;
        this.resolution = resolution;
        this.displaySurface = displaySurface;
        this.responseTime = responseTime;
        this.flickerFree = flickerFree;
        this.refreshRate = refreshRate;
    }

    // Getters
    public int getPanelSize() {
        return this.panelSize;
    }

    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public String getPanelType() {
        return this.panelType;
    }

    public String getPanelBacklite() {
        return this.panelBacklite;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getDisplaySurface() {
        return this.displaySurface;
    }

    public int getResponseTime() {
        return this.responseTime;
    }

    public boolean getFlickerFree() {
        return this.flickerFree;
    }

    public int getRefreshRate() {
        return this.refreshRate;
    }

    // Print Attributes
    public void printPanelSize() {
        System.out.println("PanelSize: " + this.getPanelSize());
    }

    public void printAspectRatio() {
        System.out.println("AspectRatio: " + this.getAspectRatio());
    }

    public void printPanelType() {
        System.out.println("PanelType: " + this.getPanelType());
    }

    public void printPanelBacklite() {
        System.out.println("PanelBacklite: " + this.getPanelBacklite());
    }

    public void printResolution() {
        System.out.println("Resolution: " + this.getResolution());
    }

    public void printDisplaySurface() {
        System.out.println("DisplaySurface: " + this.getDisplaySurface());
    }

    public void printResponseTime() {
        System.out.println("ResponseTime: " + this.getResponseTime());
    }

    public void printFlickerFree() {
        System.out.println("FlickerFree: " + this.getFlickerFree());
    }

    public void printRefreshRate() {
        System.out.println("RefreshRate: " + this.getRefreshRate());
    }

    public void printDisplay() {
        printPanelSize();
        printAspectRatio();
        printPanelType();
        printPanelBacklite();
        printResolution();
        printDisplaySurface();
        printResponseTime();
        printFlickerFree();
        printRefreshRate();
    }
    
}
