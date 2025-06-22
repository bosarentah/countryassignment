public class DevelopingCountry extends Country {
    private String mainExport;

    public DevelopingCountry(String name, long population, String capital, String mainExport) {
        super(name, population, capital);
        this.mainExport = mainExport;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Main Export: " + mainExport);
    }
}
