package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;


    @Test
    void saveMethod(){


        Product product = new Product();
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setSku("11ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");


       Product savedObject =  productRepository.save(product);

        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());
    }
    



}