import javax.swing.*;
import java.awt.*;

public class ShopView {

    private static final String JFRAME_NAME = "Cudowna aplikacja";

    public void showProducts(Product[] products) {
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }

    public void showProductsUsingJFrame(Product[] products) {
        FlowLayout experimentLayout = new FlowLayout();
        JFrame jFrame = new JFrame(JFRAME_NAME);
        jFrame.setSize(200, 300);
        jFrame.setLocationRelativeTo(null);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(experimentLayout);

        for (Product product : products) {
            if (product != null) {
                JButton button = new JButton(product.getName());
                button.setForeground(ColorFactory.generate());
                jFrame.getContentPane().add(button);
            }
        }

        jFrame.pack();
        jFrame.setVisible(true);
    }
}
