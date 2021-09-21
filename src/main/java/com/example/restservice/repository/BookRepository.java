package com.example.restservice.repository;

import com.example.restservice.entity.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
