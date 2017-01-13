import java.util.Random;

public class ProductRandomFactory {

    private static char randLowerLetter() {
        return (char) ((int)(Math.random() * 25) + 97);
    }

    private static char randUpperLetter() {
        return (char) ((int)(Math.random() * 25) + 65);
    }

    public static Product generate() {
        Random random = new Random();
        Product product = new Product();
        product.setNumber((int)(Math.random() * 1000));
        product.setPrice(random.nextDouble());
        String name = "";
        name = name + randUpperLetter();
        for (int i = 0; i < 10; i++) {
            name = name + randLowerLetter();
        }
        product.setName(name);
        return product;
    }

}
