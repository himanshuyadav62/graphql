package com.example.graphql.author;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Author {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;
        String firstName;
        String lastName;

}