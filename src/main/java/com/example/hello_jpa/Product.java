package com.example.hello_jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;


    private String name;

    @OneToMany(mappedBy = "product")
    private List<MemberProduct> memberProductList;

}
