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
//    Классы наследники Manager и Developer от Employee:
//    Manager имеет дополнительное поле int managedEmployees - количество подчиненных.
}