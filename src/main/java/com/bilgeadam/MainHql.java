package com.bilgeadam;

import com.bilgeadam.controller.BookController;
import com.bilgeadam.repository.BookRepository;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.enums.EBookType;

import java.util.List;

/*
  1- turu novel olan kitapların listesi;
  2-ismi a ile başayan yazarların kitaplarını getirelim;


 */
public class MainHql {

    public static void main(String[] args) {

        BookController bookController=new BookController();
        BookRepository bookRepository=new BookRepository()
                ;
        //bookController.getBooksByType(EBookType.NOVEL).forEach(System.out::println);
 //   bookRepository.getBooksByType().forEach(System.out::println);
   // bookRepository.getBooksWithAuthorNameStartWith("A").forEach(System.out::println);
  //  bookRepository.getBooksByTypeWithCriteria(EBookType.NOVEL).forEach(System.out::println);
    bookRepository.getBooksByTypeNamedQuery(EBookType.NOVEL).forEach(System.out::println);
    }


}
