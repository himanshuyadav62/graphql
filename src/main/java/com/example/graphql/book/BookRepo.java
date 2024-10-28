package com.example.graphql.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo  extends JpaRepository<Book, String> {
    
}
