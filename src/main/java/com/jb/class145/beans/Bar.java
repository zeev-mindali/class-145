package com.jb.class145.beans;

import com.jb.class145.interfaces.Teachable;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Qualifier("Bar")
public class Bar implements Teachable {
    @Override
    public void info() {
        System.out.println("Bar: I Have a cookie.....");
    }
}
