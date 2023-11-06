package com.springdatajpa.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name ="jpa_product")
public class Product {

    @Id
    private int pId;
    private String productName;


    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();
}
