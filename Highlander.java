public class Highlander extends Toyota {
    public Highlander() {
        setEstablishedYear(2023);
        setPrice(36620.0);
        setType('s');
    }

    @Override
    public void sound() {
        System.out.println("Highlander sound");
    }

    public static class Configuration {
        private int seats;

        public Configuration(int seats) {
            if (seats == 7 || seats == 8) {
                this.seats = seats;
            } else {
                throw new IllegalArgumentException(
                    "Configuration can only be 7 or 8 seats."
                );
            }
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            if (seats == 7 || seats == 8) {
                this.seats = seats;
            } else {
                throw new IllegalArgumentException(
                    "Configuration can only be 7 or 8 seats."
                );
            }
        }
    }
}
