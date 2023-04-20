package service;

import java.util.List;
import java.util.Map;

public interface VendingMachine {
    List<String> getProductPriceList();

    void addProduct( Map<String, Object> productData);

    List<String> getProducts(Map<String, Object> matchPattern);

    
}