package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookPojo;
import com.example.demo.projection.BookProjection;

import java.util.List;

public interface BookService {
    Book saveData(BookPojo bookpojo);
    List<BookProjection> findAll() ;
    List<BookProjection> findAll2() ;

    void deleteAll(BookPojo bookPojo) ;
}
