public class Main {
    public static void main(String[] args) {
        // Create objects of all classes
        Automobile auto = new Automobile();
        Toyota toyota = new Toyota();
        Corolla corolla = new Corolla();
        Tundra tundra = new Tundra();
        Highlander highlander = new Highlander();

        // Demonstrate polymorphism/static/dynamic binding
        Automobile auto1 = new Toyota();
        Automobile auto2 = new Corolla();
        Automobile auto3 = new Tundra();
        Automobile auto4 = new Highlander();

        // Demonstrate the use of Wrapper classes
        System.out.println("Toyota established year: " +
                toyota.getEstablishedYear());
        System.out.println("Corolla price: " + corolla.getPrice());
        System.out.println("Highlander type: " + highlander.getType());

        // Demonstrate sounds
        auto.sound();
        toyota.sound();
        corolla.sound();
        tundra.sound();
        highlander.sound();

        // Demonstrate additional method in Corolla
        corolla.additionalMethod();

        // Demonstrate using the inner/nested class
        Highlander.Configuration config7 =
                new Highlander.Configuration(7);
        Highlander.Configuration config8 =
                new Highlander.Configuration(8);

        System.out.println("Highlander configuration seats: " +
                config7.getSeats());
        System.out.println("Highlander configuration seats: " +
                config8.getSeats());
    }
}
