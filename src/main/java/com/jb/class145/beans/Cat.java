package com.jb.class145.beans;

import com.jb.class145.aop.NameChanged;
import com.jb.class145.aop.SendSMS;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
@Scope("prototype")
public class Cat {
    //private String[] names = {"Bumper","Hong","Tal","Bar","Nadav"};
    //private String name=names[(int)(Math.random()*names.length)];
    @Value("${newCatName}")
    private String name;

    @Autowired
    private Chip chip;

    //@SendSMS
    @NameChanged
    public void setChip(Chip chip) {
        //this.chip = chip;
    }

    @NameChanged
    public void setName(String name) {
        //this.name = name;
    }
}
