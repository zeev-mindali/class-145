package com.jb.class145.beans;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class MyNumber {
    private int x = (int)(Math.random()*101);

    public void printX(){
        System.out.println(this.getClass().getName() + "X="+x);
    }
}
