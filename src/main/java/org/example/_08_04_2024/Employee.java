package org.example._08_04_2024;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//    Класс Employee:
//    Базовый класс для сотрудника с полями:
//    String name - имя сотрудника.
//    int age - возраст.
//    double salary - зарплата.
//    Department department - отдел, использует энам Department.
//    Конструктор с параметрами для всех полей.
//    Геттеры и сеттеры для всех полей.
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

