package com.bookapp.books.app.service;

import com.bookapp.books.app.models.Book;

import java.util.List;

public interface BookService  {


    Book getById(Long bookid);

    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByCategory(String category);

    Book saveBook(Book book);
}
