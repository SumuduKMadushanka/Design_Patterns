import java.util.ArrayList;

public class ComputerComponentPartitioner implements ComputerComponentVisitor {
    private ArrayList<Hardware> hardwares;
    private ArrayList<Software> softwares;

    public ComputerComponentPartitioner() {
        hardwares = new ArrayList<>();
        softwares = new ArrayList<>();
    }

    // Getters
    public ArrayList<Hardware> getHardwares() {
        return this.hardwares;
    }

    public ArrayList<Software> getSoftwares() {
        return this.softwares;
    }

    @Override
    public void visit(Hardware hardware) {
        hardwares.add(hardware);
    }

    @Override
    public void visit(Software software) {
        softwares.add(software);
    }
    
}
