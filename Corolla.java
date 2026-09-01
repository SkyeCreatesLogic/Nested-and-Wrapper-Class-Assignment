public class Corolla extends Toyota {
    public Corolla() {
        setEstablishedYear(2023);
        setPrice(21700.0);
        setType('c');
    }

    @Override
    public void sound() {
        System.out.println("Corolla sound");
    }

    public void additionalMethod() {
        System.out.println("This is an additional method specific to Corolla.");
    }
}
