public class IslandCountry extends Country {
    private int numberOfIslands;

    public IslandCountry(String name, long population, String capital, int numberOfIslands) {
        super(name, population, capital);
        this.numberOfIslands = numberOfIslands;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Islands: " + numberOfIslands);
    }
}
