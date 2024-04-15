package org.example._10_04_2024.Information;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private Address address;
    private double salary;
    private Auto auto;
    private Account[] accounts;

    public Person(String name, String surname, Address address, double salary, Auto auto, Account[] accounts) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.salary = salary;
        this.auto = auto;
        this.accounts = accounts;
    }
}
