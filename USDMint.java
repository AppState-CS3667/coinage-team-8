public class USDMint extends Mint {
   private static USDMint UMint;
   private boolean mint;
    private USDMint()
    {
      mint = true;   
    }

    public static USDMint getInstance()
    {
        if(UMint == null)
        {
            UMint = new USDMint();
        }
        return UMint;
    }

    public Coin makeCoin(String coin){
        if (coin.equals("1.00")) {
            return new Dollar();
        }
        else if (coin.equals("0.50")) {
            return new HalfDollar();
        }
        else if (coin.equals("0.25")) {
            return new Quarter();
        }
        else if (coin.equals("0.10")) {
            return new Dime();
        }
        else if (coin.equals("0.05")) {
            return new Nickel();
        }
        else if (coin.equals("0.01")) {
            return new Penny();
        }
        else {
            return null;
        }
    }
}
