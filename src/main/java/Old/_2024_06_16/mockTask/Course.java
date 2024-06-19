package Old._2024_06_16.mockTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс Course
 * Описание: Этот класс представляет курс.
 * Поля:
 * String id: уникальный идентификатор курса.
 * String name: название курса.
 * Конструктор:
 * Принимает id и name.
 * Методы:
 * Геттеры для полей id и name.
 */
@AllArgsConstructor
@Getter
@Setter
public class Course {
    private String id;
    private String name;
}