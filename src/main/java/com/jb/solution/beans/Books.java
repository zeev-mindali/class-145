package com.jb.solution.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Books {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, length = 40)
    private String name;

    private int year;

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
