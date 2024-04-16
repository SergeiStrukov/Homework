package org.example._08_04_2024;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
//2
@AllArgsConstructor
@Getter
public enum Department {
    IT("Informational technology", 10000),
    HR("Electrical technology", 10000);
    private String name;
    private int number;
}