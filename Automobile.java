public class Automobile {
    private Integer establishedYear;
    private Double price;
    private String slogan;
    private Character type;

    // Getters
    public Integer getEstablishedYear() {
        return establishedYear;
    }

    public Double getPrice() {
        return price;
    }

    public String getSlogan() {
        return slogan;
    }

    public Character getType() {
        return type;
    }

    // Setters
    public void setEstablishedYear(Integer establishedYear) {
        this.establishedYear = establishedYear;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public void setType(Character type) {
        this.type = type;
    }

    // Method to print sound
    public void sound() {
        System.out.println("Automobile sound");
    }
}
