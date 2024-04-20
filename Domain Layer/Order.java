// Order entity
import java.util.List;

public class Order {
    private String id;
    private User user;
    private List<Product> products;

    // Constructors
    public Order(String id, User user, List<Product> products) {
        this.id = id;
        this.user = user;
        this.products = products;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
