public class CADMint extends Mint{
     private static CADMint CMint;
     private boolean mint;
     private CADMint() {
         mint = true;
     }
     public static USDMint getInstance() {
         if(UMint == null) {
             UMint = new USDMint();
         }
          return UMint;
     }
     public Coin makeCoin(String coin) {
         if (coin.equals("Toonie")) {
             return new Toonie();
         }
         else if (coin.equals("Loonie")) {
             return new Loonie();
         }
         else if (coin.equals("Fifty Cent")) {
             return new FiftyCent();
         }
         else if (coin.equals("Quarter")) {
             return new CADQuarter();
         }
         else if (coin.equals("Dime")) {
             return new CADDime();
         }
         else if (coin.equals("Nickel")) {
             return new CADNickel();
         }
         else {
             return new NullCoin();
         }
     }
}
