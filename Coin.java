public abstract class Coin {
    private String name;
    private String countryCode;
    private double denomination;
    private SmeltBehavior smelt;

    public Coin(String n, String c, double d, SmeltBehavior sb) {
        name = n;
        countryCode = c;
        denomination = d;
        smelt = sb;
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
