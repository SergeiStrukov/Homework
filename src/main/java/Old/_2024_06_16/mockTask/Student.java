package Old._2024_06_16.mockTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс Student
 * Описание: Этот класс представляет студента.
 * Поля:
 * String id: уникальный идентификатор студента.
 * String name: имя студента.
 * Конструктор:
 * Принимает id и name.
 * Методы:
 * Геттеры для полей id и name.
 */
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private String id;
    private String name;
}