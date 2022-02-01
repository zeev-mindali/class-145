package com.jb.spring_basic.beans;


import com.jb.spring_basic.aop.CatBanner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class NormalCat {
    private int id;
    private String name;
    private float weight;
    private List<Toy> toyList;

   // @CatBanner
    public void addCat(Cat cat){
        this.id=cat.getId();
        this.name=cat.getName();
        this.weight=cat.getWeight();
        this.toyList=cat.getToys();
    }

}
