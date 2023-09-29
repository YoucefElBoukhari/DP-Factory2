public class PCFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new PC();
    }
}