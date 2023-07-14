package com.example.rediscachedemo.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;


@Data
@Builder
public class Book implements Serializable {
    private String name;
    private String isbn;
    private Integer pages;
    private String author;
    private LocalDate publishedDate;

}
