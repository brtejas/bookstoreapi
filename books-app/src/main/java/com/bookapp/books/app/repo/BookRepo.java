package com.bookapp.books.app.repo;

import com.bookapp.books.app.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    
    List<Book> findByAuthor(String author);

    List<Book> findByCategory(String category);
}
