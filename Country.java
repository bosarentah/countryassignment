public class Country {
    protected String name;
    protected long population;
    protected String capital;

    public Country(String name, long population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    public void displayInfo() {
        System.out.println("Country Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + capital);
    }
}
