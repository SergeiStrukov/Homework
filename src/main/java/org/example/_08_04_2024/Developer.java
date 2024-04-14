package org.example._08_04_2024;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, double salary, Department department, String programmingLanguage) {
        super(name, age, salary, department);
        this.programmingLanguage = programmingLanguage;
    }
}
