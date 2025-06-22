public class DevelopedCountry extends Country {
    private double gdp;

    public DevelopedCountry(String name, long population, String capital, double gdp) {
        super(name, population, capital);
        this.gdp = gdp;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("GDP: $" + gdp + " billion");
    }
}
