package com.example.rediscachedemo.service;


import com.example.rediscachedemo.entity.Book;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookService {

    @Cacheable(value = "books", key = "#isbn")
    public Book getBookByIsbn(String isbn) {
        System.out.println("Getting book from DB");
        return Book.builder()
                .name("Some book name")
                .isbn(isbn)
                .pages(100)
                .author("Some author")
                .publishedDate(LocalDate.now())
                .build();
    }

    @CachePut(value = "books", key = "#isbn")
    public Book updateBook(String isbn) {
        System.out.println("Updating book in DB");
        return Book.builder()
                .name("Some book name updated")
                .isbn(isbn)
                .pages(100)
                .author("Some author")
                .publishedDate(LocalDate.now())
                .build();
    }

    @CacheEvict(value = "books", key = "#isbn")
    public void deleteBook(String isbn) {
        System.out.println("Deleting book from DB");
    }
}
