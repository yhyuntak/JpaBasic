package com.example.hello_jpa;

import javax.persistence.Entity;

@Entity
public class Book extends Item{

    private String author;

    private String isbn;
}
