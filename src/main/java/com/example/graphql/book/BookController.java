package com.example.graphql.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.example.graphql.author.Author;
import com.example.graphql.author.AuthorRepo;

@Controller
public class BookController {

    private  BookRepo bookRepo; 
    private AuthorRepo authorRepo; 

    public BookController(BookRepo bookRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookRepo.findById(id).orElse(null); 
    }

    @SchemaMapping
    public Author author(Book book) {
        return this.authorRepo.findById(book.getAuthorId()).orElse(null);
    }

    @MutationMapping
    public Book createBook(@Argument String name, @Argument int pageCount, @Argument String authorId) {
        Book book = new Book();
        book.setName(name);
        book.setPageCount(pageCount);
        book.setAuthorId(authorId);
        return bookRepo.save(book);
    }

    @MutationMapping
    public Author createAuthor(@Argument String firstName, @Argument String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorRepo.save(author);
    }


}
