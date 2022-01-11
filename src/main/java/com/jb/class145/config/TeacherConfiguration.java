package com.jb.class145.config;

import com.jb.class145.beans.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfiguration {
    @Bean
    @Qualifier("teacherZeev")
    public Teacher teacherZeev(){
        Teacher zeev = new Teacher();
        zeev.setName("Zeev");
        zeev.setPhone("052-404-3142");
        return zeev;
    }

    /*
    @Bean
    @Qualifier("teacherAsi")
    public Teacher teacherAsi(){
        Teacher asi = new Teacher("Asi","054-725-6017");
        return asi;
    }
    */
}
