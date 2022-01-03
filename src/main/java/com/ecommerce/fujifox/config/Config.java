package com.ecommerce.fujifox.config;

import com.ecommerce.fujifox.product.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}
