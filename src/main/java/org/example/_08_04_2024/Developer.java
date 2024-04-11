package org.example._08_04_2024;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*Developer имеет дополнительное поле String programmingLanguage - основной язык программирования разработчика.
Конструкторы с параметрами для всех полей, включая поля базового класса. */
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, double salary, Department department, String programmingLanguage) {
        super(name, age, salary, department);
        this.programmingLanguage = programmingLanguage;
    }
}
