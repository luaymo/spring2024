// ProductController class
import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    // Other product related endpoints
}
