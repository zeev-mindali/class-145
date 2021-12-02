package functional_programing.oldSchool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Gender gender;
}

enum Gender{
    Male,Female,Other
}