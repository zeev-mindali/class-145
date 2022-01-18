package com.jb.spring_basic.services;

import com.jb.spring_basic.util.Art;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class BumperService {
    public void showBanner(){
        System.out.println(Art.cat);
    }
}
