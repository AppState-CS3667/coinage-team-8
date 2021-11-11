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
        if (coin.equals("Dollar")) {
            return new Dollar();
        }
        else if (coin.equals("HalfDollar")) {
            return new HalfDollar();
        }
        else if (coin.equals("Quarter")) {
            return new Quarter();
        }
        else if (coin.equals("Dime")) {
            return new Dime();
        }
        else if (coin.equals("Nickel")) {
            return new Nickel();
        }
        else if (coin.equals("Penny")) {
            return new Penny();
        }
        else {
            return new NullCoin();
        }
    }
}
