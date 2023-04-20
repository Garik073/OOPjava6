package controller;

import java.util.List;
import java.util.Map;

import service.VendingMachineImpl;

public class VendingMachineController {
    private VendingMachineImpl vendingMachineService = new VendingMachineImpl();

    public void addProduct( Map<String, Object> productData) {
        
            vendingMachineService.addProduct( productData);
        
    }

    public List<String> getPpriceList() {
        return vendingMachineService.getProductPriceList();
    }

    public List<String> getProductByMatchPattern(Map<String, Object> matchPattern) {
        return vendingMachineService.getProducts(matchPattern);
    }
}