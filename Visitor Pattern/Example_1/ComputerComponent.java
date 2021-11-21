public interface ComputerComponent {
    
    public void printDetails();
    public void accept(ComputerComponentVisitor computerComponentVisitor);
    
}
