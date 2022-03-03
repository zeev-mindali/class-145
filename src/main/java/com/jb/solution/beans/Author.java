package com.jb.solution.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Singular;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 40)
    private String name;

    private float weight;

    //how we will save the data
    @Enumerated(EnumType.STRING)     //will write the string itself
    //@Enumerated(EnumType.ORDINAL)  //will write the number
    @Column(name = "level")
    private AuthorLevel authorLevel;

    @Singular
    @OneToMany(cascade = CascadeType.ALL)
    List<Books> books;

    public List<Books> getBooks() {
        return books;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public AuthorLevel getAuthorLevel() {
        return authorLevel;
    }
}
