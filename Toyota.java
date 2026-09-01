public class Toyota extends Automobile {
    public Toyota() {
        setEstablishedYear(1937);
        setPrice(0.0);
        setSlogan("Let's Go Places");
        setType('n');
    }

    @Override
    public void sound() {
        System.out.println("Toyota sound");
    }
}
