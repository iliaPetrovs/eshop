package com.ecommerce.fujifox.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final ProductRepository repository;

    @Autowired
    public DatabaseLoader(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Product(5, "ITA Bag", "A bag", "www.as.com", 20.99, 5));
    }
}
