package com.bilgeadam;

import com.bilgeadam.controller.BookController;
import com.bilgeadam.repository.BookRepository;
import com.bilgeadam.repository.BorrowRepository;
import com.bilgeadam.repository.entity.Book;
import com.bilgeadam.repository.enums.EBookType;

import java.util.Arrays;
import java.util.List;

/*
  1- turu novel olan kitapların listesi;
  2-ismi a ile başayan yazarların kitaplarını getirelim;
  3- kitap ara fonksiyonu title a gore kitap getiren metodu yazalım
  4-  bir  kullanıcın yaptıgı odunc almalar
  5- 1 kitabı hangi kullanıclar kiralamış
  6- her kitap turunden kaç adet kitap vardır ? NOVEL 5 History 1
  7- Odunc alma metodu ==>
  bir kiralanabilir kitapları listeliyeceğiz
  daha sonra bir kullanıcı bilgisi alacagız
  daha sonra kaç gun kiralamak istediğmizi gireceğiz ve sonunda bir kiralama gerçekleştireceğiz
  (Uyarı: kiralama sonucu gerçekleşen değişklikleri databsede guncellemeyi unutmayın )
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
//    bookRepository.getBooksByTypeNamedQuery(EBookType.NOVEL).forEach(System.out::println);

       // System.out.println(bookRepository.findByTitle("Sevme Sanatı"));  ;
     //   System.out.println( bookRepository.findByTitle2("Yabancı")); ;
     // List<Book>list=bookRepository.findbyTitleWithCriteria("Yabancı");
//      List<Object[]>list=bookRepository.findbyTitleWithCriteria2("Yabancı");
//
//      for (Object[] array:list){
//          System.out.println(Arrays.toString(array));
//        }
        BorrowRepository borrowRepository=new BorrowRepository();
      //  borrowRepository.findByUserId(1L).forEach(System.out::println);
     //   borrowRepository.findByUserWithBookId(6L).forEach(System.out::println);
       // List<Object[]>list= bookRepository.getBooksCountByBookType();
       // List<Object[]>list= bookRepository.getBooksCountByBookTypeWithCriteria();
        List<Object[]>list= bookRepository.getBooksCountByBookTypeWithNamedQuery();
        for (Object[] array:list){
         System.out.println(Arrays.toString(array));
        }
    }


}
