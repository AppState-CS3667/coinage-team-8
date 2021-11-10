import java.util.Random;

public class NickelSmelt extends SmeltBehavior {
    public void smelt() {
        Random rand = new Random();
        if (rand.nextInt(1000) > 1) {
            System.out.println("Smelting complete");
        }
        else {
            System.out.println("Smelting failed");
        }
    }
}
