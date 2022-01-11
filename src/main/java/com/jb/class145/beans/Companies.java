package com.jb.class145.beans;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Companies {
    //primary key
    @Id
    //auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY) //create unique ID for each row
    @Column(name = "company_id")
    private int ID;
    @Column(nullable = false,length = 40) //not nullable, length up to 40 chars
    private String name;
    @Column(nullable = false,length = 40)
    private String email;
    @Column(nullable = false,length = 10)
    private String password;

    @OneToMany(
            cascade = CascadeType.ALL, //save all the child data (coupon), before saving the object itself
            orphanRemoval = true, //if this object was deleted, remove the connection to the coupons
            fetch = FetchType.EAGER //get all children
    )
    //@Singular
    private List<Coupon> coupons;

    /*
    public Companies(String name, String email , String password) {
        this.name=name;
        this.email=email;
        this.password=password;
    }
    */
}
