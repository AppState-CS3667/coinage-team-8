public abstract class Coin {
    private String name;
    private String countryCode;
    private double denomination;

    public Coin(String n, String c, double d) {
        name = n;
        countryCode = c;
        denomination = d;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public double getDenomination() {
        return denomination;
    }
}
