package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.pojo.BookPojo;
import com.example.demo.projection.BookProjection;
import com.example.demo.service.BookService;
import com.example.demo.shared.Pojo.GlobalApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;





        @GetMapping
        public GlobalApiResponse<List<BookProjection>> getData(BookProjection bookProjection) {
            return GlobalApiResponse.
                    <List<BookProjection>>builder()
                    .data(this.bookService.findAll())
                    .statusCode(200)
                    .message("data retreived successfully")
                    .build();
        }

        @PostMapping
        public GlobalApiResponse<String> save(@RequestBody BookPojo bookPojo) {
            this.bookService.saveData(bookPojo);
            return GlobalApiResponse.
                    <String>builder()
                    .data("saved")
                    .statusCode(200)
                    .message("data saved successfully")
                    .build();
        }
        @PutMapping
        public GlobalApiResponse<Book> update(@RequestBody BookPojo bookPojo){
            Book updateBook  = this.bookService.saveData(bookPojo);
            return  GlobalApiResponse.<Book>builder()
                    .data(updateBook)
                    .statusCode(200)
                    .message("Data has been updated succefully")
                    .build() ;
        }

        @DeleteMapping("/delete")
        public GlobalApiResponse<String> deleteBook(@RequestBody BookPojo bookPojo) {
            this.bookService.deleteAll(bookPojo);
            return GlobalApiResponse.<String>builder()
                    .data("Book with groundId " + bookPojo.getGround_id() + ", bookName " + bookPojo.getBookName() + ", and userId " + bookPojo.getUser_id() + " deleted successfully")
                    .statusCode(200)
                    .message("Data deleted successfully")
                    .build();
        }







}
