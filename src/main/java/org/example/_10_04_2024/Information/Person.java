package org.example._10_04_2024.Information;

import lombok.Getter;
import lombok.Setter;
//
import java.util.List;

@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private Address address;
    private double salary;
    private Auto auto;
    private List<Account> accounts;

    public Person(String name, String surname, Address address, double salary, Auto auto, List <Account> accounts) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.salary = salary;
        this.auto = auto;
        this.accounts = accounts;
    }
}
