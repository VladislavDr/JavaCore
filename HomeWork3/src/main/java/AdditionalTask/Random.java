package AdditionalTask;
import java.util.random.*;

public class Random {
    public static int rnd() {
        java.util.Random random = new java.util.Random();
        int rnd = random.nextInt(3, 6);
        return rnd;
    }
}
