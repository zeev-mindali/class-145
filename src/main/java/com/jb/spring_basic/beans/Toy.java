package com.jb.spring_basic.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Builder
@Table(name="toys")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 40)
    private String name;

}
