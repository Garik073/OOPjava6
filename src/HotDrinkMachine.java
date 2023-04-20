public class HotDrinkMachine implements VendingMachine {

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Integer cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    HotDrink getProduct(Integer temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink && temperature.equals(((HotDrink) product).getTemperature()))
                return (HotDrink) product;
        }
        return null;
    }

    HotDrink getProduct(String name) {
        for (Product product : products) {
            if (product instanceof HotDrink && name.equals(product.getName())) {
                return (HotDrink) product;
            }
        }
        return null;
    }

    HotDrink getProduct(Double volume) {
        for (Product product : products) {
            if (product instanceof HotDrink && volume.equals(((HotDrink) product).getVolume()))
                return (HotDrink) product;
        }
        return null;
    }

}