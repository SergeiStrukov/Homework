package org.example._08_04_2024;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends Employee {
    private int managedEmployees;

    public Manager(String name, int age, double salary, Department department, int managedEmployees) {
        super(name, age, salary, department);
        this.managedEmployees = managedEmployees;
    }
}
