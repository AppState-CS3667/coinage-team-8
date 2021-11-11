public class CADMint extends Mint{
     private static CADMint CMint;
     private boolean mint;
     private CADMint() {
         mint = true;
     }
     public static CADMint getInstance() {
         if(CMint == null) {
             CMint = new CADMint();
         }
          return CMint;
     }
     public Coin makeCoin(String coin) {
         if (coin.equals("2.00")) {
             return new Toonie();
         }
         else if (coin.equals("1.00")) {
             return new Loonie();
         }
         else if (coin.equals("0.50")) {
             return new FiftyCent();
         }
         else if (coin.equals("0.25")) {
             return new CADQuarter();
         }
         else if (coin.equals("0.10")) {
             return new CADDime();
         }
         else if (coin.equals("0.05")) {
             return new CADNickel();
         }
         else {
             return null;
         }
     }
}
