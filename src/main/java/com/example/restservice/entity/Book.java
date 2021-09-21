package com.example.restservice.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}
