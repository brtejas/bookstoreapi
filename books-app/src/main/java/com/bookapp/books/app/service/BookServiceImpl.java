package com.bookapp.books.app.service;

import com.bookapp.books.app.models.Book;
import com.bookapp.books.app.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    public Book getById(Long bookid) {
        return bookRepo.findById(bookid).get();
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookRepo.findByAuthor(author);
    }

    @Override
    public List<Book> getBooksByCategory(String category) {
        return bookRepo.findByCategory(category);
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }


}
