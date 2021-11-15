import java.util.ArrayList;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        
        System.out.println("-------- Visitor Pattern Demo --------");

        ArrayList<ComputerComponent> computerComponents = new ArrayList<>();

        Monitor m1, m2, m3, m4;
        m1 = new Monitor("ASUS ROG STRIX XG49VQ SUPER ULTRA-WIDE HDR GAMING MONITOR 49\" (3840 X 1080), 144HZ", 
            new Display(49, "32:9", "VA", "LED", "3840x1080", "Non-Glare", 4, true, 144), 
            1, 2, 2, 47, 240, 120, 249000.0);

        m2 = new Monitor("ASUS ROG STRIX XG35VQ (3440X1440) 100HZ, ADAPTIVE-SYNC", 
            new Display(35, "21:9", "VA", "LED", "3440x1440", "Non-Glare", 1, true, 100), 
            1, 2, 2, 43, 240, 100, 215000.0);

        m3 = new Monitor("SAMSUNG 49\" ODYSSEY CRG9 QLED GAMING MONITOR WITH WITH DUAL QHD SUPER ULTRA-WIDE SCREEN", 
            new Display(49, "32:9", "VA", "LED", "5120 x 1440", "Dual QHD", 4, true, 120), 
            2, 1, 2, 100, 240, 100, 390000.0);

        m4 = new Monitor("ACER PREDATOR X34 GS 34 INCH UW-QHD 180HZ IPS GSYNC CURVED GAMING MONITOR", 
            new Display(34, "21:9", "IPS", "LED", "3440 x 1440", "Ultra-Wide QHD", 1, true, 100), 
            1, 2, 2, 65, 240, 130, 205000.0);

        computerComponents.add(m1);
        computerComponents.add(m2);
        computerComponents.add(m3);
        computerComponents.add(m4);

        for (ComputerComponent computerComponent : computerComponents) {
            computerComponent.printDetails();
            System.out.println();
        }
    }
}