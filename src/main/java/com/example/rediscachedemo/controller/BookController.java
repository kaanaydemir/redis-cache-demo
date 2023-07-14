package com.example.rediscachedemo.controller;

import com.example.rediscachedemo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{isbn}")
    public Object getBookByIsbn(String isbn) {
        return bookService.getBookByIsbn(isbn);
    }

    @PutMapping("/{isbn}")
    public Object updateBook(String isbn) {
        return bookService.updateBook(isbn);
    }

    @DeleteMapping("/{isbn}")
    public void deleteBook(String isbn) {
        bookService.deleteBook(isbn);
    }
}
