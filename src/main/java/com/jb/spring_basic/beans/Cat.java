package com.jb.spring_basic.beans;

import com.jb.spring_basic.aop.CatBanner;
import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity //JPA->JAVAX->instance for the database
//@Component -> instance->MEMORY
@Table(
        name="cat", //change table name....
        //index
        indexes = {
            @Index(columnList = "name"),
            @Index(columnList = "weight")
        }
)

public class Cat{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 40)
    //show bumper banner
    private String name;

    @Column(nullable = false)
    private float weight;

    @OneToMany (cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @Singular
    private List<Toy> toys;

    public Cat(String name, float weight, List<Toy> toys) {
        this.name = name;
        this.weight = weight;
        this.toys = toys;
    }
}
