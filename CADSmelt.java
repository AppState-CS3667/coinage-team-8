import java.util.Random;

public class CADSmelt extends SmeltingBehavior {
    public void smelt() {
        Random rand = new Random();
        if (rand.nextInt(1000) > 1) {
            System.out.println("Smelting completed");
        }
        else {
            System.out.println("Smelting failed");
        }
    }
}
