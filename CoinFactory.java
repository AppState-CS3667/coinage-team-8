interface CoinClientDemo{
    public Coin makeCoin();
}

public class CoinFactory implements CoinClientDemo {
   
    public static void main(String[] args){
        CoinFactory cf = new Coinfactory();
        cf.makeCoin(Dime);
    }
       
    public Coin makeCoin() {
        return new Coin();
    }
}

