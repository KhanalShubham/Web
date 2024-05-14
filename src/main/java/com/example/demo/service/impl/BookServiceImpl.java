package com.example.demo.service.impl;

import com.example.demo.entity.Book;
import com.example.demo.entity.Ground;
import com.example.demo.entity.User;
import com.example.demo.pojo.BookPojo;
import com.example.demo.projection.BookProjection;
import com.example.demo.repository.BookRepository;

import com.example.demo.repository.GroundRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRespository;
    private final GroundRepository groundRespository;
    private final UserRepository userRespository;


    @Override
    public Book saveData(BookPojo bookPojo) {
        Book book = new Book();
//        book.setId(bookPojo.getId()) ;
//        book.setGroundId(bookPojo.getId()) ;
        book.setName(bookPojo.getBookName());
        Ground ground = groundRespository.findById(bookPojo.getGround_id()).get();
        book.setGround(ground);

        User user = userRespository.findById(bookPojo.getUser_id()).get();
        book.setUser(user);
        bookRespository.save(book);


        return book;
    }

    @Override
    public List<BookProjection> findAll() {
        return List.of();
    }

    @Override
    public List<BookProjection> findAll2() {
        return List.of();
    }

    @Override
    public void deleteAll(BookPojo bookPojo) {

    }
}