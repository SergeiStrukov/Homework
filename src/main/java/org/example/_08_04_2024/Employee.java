package org.example._08_04_2024;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//4
@Getter
@Setter
@AllArgsConstructor
@ToString

public class Employee {
    private String name;
    private int age;
    private double salary;
    private Department department;
}


