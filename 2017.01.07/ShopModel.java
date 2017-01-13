public class ShopModel {

    private Product[] products = new Product[10000];

    private int productCount = 0;

    ShopModel() {
        for (int i = 0; i < 100; i++) {
            addProduct(
                    ProductRandomFactory.generate()
            );
        }
    }

    public int productCount() {
        return productCount;
    }

    public void addProduct(Product product) {
        products[productCount] = product;
        productCount++;
    }

    public Product getProduct(int index) {
        return products[index];
    }

    public Product[] getProducts() {
        return products;
    }
}
