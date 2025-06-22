public class MainClass {
    public static void main(String[] args) {
        DevelopedCountry usa = new DevelopedCountry("USA", 331000000, "Washington D.C.", 21000);
        DevelopingCountry india = new DevelopingCountry("India", 1380000000, "New Delhi", "Textiles");
        IslandCountry japan = new IslandCountry("Japan", 125000000, "Tokyo", 6852);
        LandlockedCountry nepal = new LandlockedCountry("Nepal", 30000000, "Kathmandu", new String[]{"India", "China"});

        System.out.println("=== Developed Country ===");
        usa.displayInfo();
        System.out.println();

        System.out.println("=== Developing Country ===");
        india.displayInfo();
        System.out.println();

        System.out.println("=== Island Country ===");
        japan.displayInfo();
        System.out.println();

        System.out.println("=== Landlocked Country ===");
        nepal.displayInfo();
    }
}
