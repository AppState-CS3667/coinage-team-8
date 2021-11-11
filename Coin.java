import java.util.Random;

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
    public void smelt() {
        smelt.smelt();
    }
    public void polish() {
        Random rand = new Random();
        if (rand.nextInt(1000) > 1) {
            System.out.println("Polishing completed");
        }
        else {
            System.out.println("Polishing failed");
        }
    }
    public void inspect() {
        Random rand = new Random();
        if (rand.nextInt(1000) > 1) {
            System.out.println("Inspecting completed");
        }
        else {
            System.out.println("Inspecting failed");
        }
    }
}
class NullCoin extends Coin{
    public NullCoin() {
        super(null, null, 0, null);
    }
    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public String getCountryCode()
    {
        return null;
    }

    @Override
    public double getDenomination()
    {
        return 0;
    }
    public void smelt()
    {
    }
}
