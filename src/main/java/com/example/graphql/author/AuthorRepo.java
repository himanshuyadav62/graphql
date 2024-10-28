package com.example.graphql.author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, String> {
    
}
