public class ShopController {

    private ShopView view;
    private ShopModel model;

    public ShopController() {

        model = new ShopModel();
        view = new ShopView();

        view.showProducts(model.getProducts());
        view.showProductsUsingJFrame(model.getProducts());

    }

}
