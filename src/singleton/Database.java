package singleton;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static Database instance;
    private List<Product> productList = new ArrayList<>();

    private Database(){
        productList.add(new Product( "Chanel", 490.00));
        productList.add(new Product( "212", 380.00));
    }
    public static Database getInstance(){
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public List<Product> getProductList() {
        return productList;
    }

}
