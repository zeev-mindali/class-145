package com.jb.class145.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
public class Student {
    @Value("${newStudentNumber}")
    private int id;
    @Value("${newStudentName}")
    private String name;
}
