package org.example._10_04_2024.Information;

import com.github.javafaker.Address;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//    5.Создать класс Person.
//        Поля:
//        - имя
//- фамилия
//- адрес(это отдельный класс)
//- зарплата
//- авто(это отдельный класс)
//- массив счетов(отдельный клас)
public class Person {
    private String name;
private String surname;
private Address address;
private double salary;
private Auto auto;

    public Person(String name, String surname, Address address, double salary, Auto auto) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.salary = salary;
        this.auto = auto;
    }
}
