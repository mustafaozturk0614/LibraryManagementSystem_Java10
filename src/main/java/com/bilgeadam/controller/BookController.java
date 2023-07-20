package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.service.BookService;

public class BookController {
    private BookService bookService;
    public BookController() {
        this.bookService = new BookService();
    }

    public Book save(Book book){
        return   bookService.save(book);
    }

}
