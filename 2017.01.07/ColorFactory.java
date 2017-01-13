import java.awt.*;
import java.util.Random;

public class ColorFactory {

    public static Color generate() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

}
