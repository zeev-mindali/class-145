package com.jb.class145.beans;

import com.jb.class145.interfaces.Teachable;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Primary
public class Zeev implements Teachable {
    @Override
    public void info() {
        System.out.println("Zeev: Hello my brother from another mother....");
    }
}
