interface ProductService{
    void getProductById(Integer id);
    void listAllProducts();
}
class ProductServiceImpl implements ProductService{
    @Override
    public void getProductById(Integer id) {
        System.out.println("This is product ID: " + id);
    }
    @Override
    public void listAllProducts() {
        System.out.println("These are all products");
    }
}
public class Main {
    public static void main(String[] koko) {
        ProductService productService  = new ProductServiceImpl();
        productService.getProductById(12);
        productService.listAllProducts();
    }
}
