public class LandlockedCountry extends Country {
    private String[] borderingCountries;

    public LandlockedCountry(String name, long population, String capital, String[] borderingCountries) {
        super(name, population, capital);
        this.borderingCountries = borderingCountries;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Bordering Countries: ");
        for (String country : borderingCountries) {
            System.out.print(country + " ");
        }
        System.out.println();
    }
}
