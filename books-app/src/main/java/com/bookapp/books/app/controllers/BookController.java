package com.bookapp.books.app.controllers;

import com.bookapp.books.app.models.Book;
import com.bookapp.books.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book-restapi")
public class BookController {
    @Autowired
    BookService bookService;



    @GetMapping("/hello")

    public String sayHello(){
        return "Welcome to BookStore";
    }

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }


    @GetMapping("/get-by-id/{id}")
    public Book getBookById(@PathVariable("id") Long bookid){
        return bookService.getById(bookid);
    }

    @GetMapping("/get-by-author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/get-by-category")
    public List<Book> getBookByCategory(@RequestParam("category") String category){
        return bookService.getBooksByCategory(category);
    }
}
