package dao;

import entity.Product;
import singleton.ConnectionDatabase;

import java.util.ArrayList;
import java.util.List;

public class DaoProduct {
    private final ConnectionDatabase connectionDatabase;

    public DaoProduct(ConnectionDatabase connectionDatabase ) {
        this.connectionDatabase = connectionDatabase;
    }

    private final List<Product> productList = new ArrayList<>(){
        {
            add(new Product("Product 1", 10.0));
            add(new Product("Product 2", 20.0));
            add(new Product("Product 3", 30.0));
        }
    };

    public List<Product> findAll() {
        return productList;
    }
}
