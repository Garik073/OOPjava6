import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    List<Product> products = new ArrayList<Product>();
    Product getProductByName(String name);

    Product getProductByCost(Integer cost);

    void addProduct(Product product);

}