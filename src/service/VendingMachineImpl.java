package service;


import java.util.List;
import java.util.Map;
import java.util.Objects;


import model.HotDrink;
import repository.VendingMachineRepository;

public class VendingMachineImpl implements VendingMachine {
    

    @Override
    public List<String> getProductPriceList() {
        return VendingMachineRepository.productList.stream()
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();
    }

    @Override
    public void addProduct( Map<String, Object> productData) {
        
                VendingMachineRepository.productList.add(new HotDrink(productData));
                
            
    }

    @Override
    public List<String> getProducts(Map<String, Object> matchPattern) {
        return VendingMachineRepository.productList.stream().filter(product -> product.isMatch(matchPattern))
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();

    }

    

}
