package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Author;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.enums.EBookType;
import com.bilgeadam.service.BookService;

import java.util.List;

public class BookController {
    private BookService bookService;
    public BookController() {
        this.bookService = new BookService();
    }

    public Book save(Book book){
        return   bookService.save(book);
    }

    public Book update(Book book) {
        return  bookService.update(book);
    }

    public List<Book> getBooksByType(EBookType type){
        return bookService.getBooksByType(type);
    }
}
