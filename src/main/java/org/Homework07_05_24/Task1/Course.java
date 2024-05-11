package org.Homework07_05_24.Task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString
@Getter
@Setter
public class Course {

    //    Задание 2: Расширение функциональности POJO класса
//    Тема: Взаимодействие между POJO классами.
//    Описание: Расширьте предыдущее задание, добавив новый класс
//    Course, который содержит название курса и список студентов,
//    записанных на курс. Студенты должны быть представлены в виде
//    списка экземпляров класса Student.
    //            Описание: Усовершенствуйте классы Student и Course, добавив
//    проверку входящих данных в сеттерах (например, возраст студента
//    не может быть отрицательным, а название курса не может быть пустым).
//    Также реализуйте методы для получения полного списка студентов определенного
//    курса и наоборот.

    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void setCourseName(String courseName) {
        if (courseName.isEmpty()) {
            throw new IllegalArgumentException("Название курса не может быть пустым");
        }
        this.courseName = courseName;
    }

    public static List<Student> countStudents(Course course) {
        return course.getStudents();
    }

    //    Задание 5: Расширенные операции с POJO классами
//    Тема: Сложные манипуляции и агрегации данных.
//            Описание: Реализуйте функционал для расчета статистики по курсам:
//    например, вычисление среднего возраста студентов на каждом курсе.

    public static double countAverageAgeOnEachCourse(Course course) {
        List<Student> students = course.getStudents();
        int sumAge = 0;
        if (students.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < course.getStudents().size(); i++) {
            sumAge += students.get(i).getAge();
        }
        return (double) sumAge / course.getStudents().size();
    }
}

