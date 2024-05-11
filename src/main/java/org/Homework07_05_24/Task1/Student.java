package org.Homework07_05_24.Task1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@ToString
@Getter
@Setter
public class Student implements Comparable<Student> {
    //
    //    Задание 1: Создание базового POJO класса
//    Тема: Основы POJO (Plain Old Java Object).
//    Описание: Создайте класс Student, который содержит базовые поля:
//    имя, фамилия, возраст. Добавьте геттеры и сеттеры для каждого поля,
//    а также переопределите методы toString(), equals() и hashCode().

    //    Задание 2: Расширение функциональности POJO класса
//    Тема: Взаимодействие между POJO классами.
//    Описание: Расширьте предыдущее задание, добавив новый класс
//    Course, который содержит название курса и список студентов,
//    записанных на курс. Студенты должны быть представлены в виде
//    списка экземпляров класса Student.

//    Задание 3: Использование коллекций в POJO классах
//    Тема: Комплексные структуры данных.
//    Описание: Добавьте в класс Student поле для хранения списка
//    курсов, на которые записан студент, в виде List<Course>.
//    Реализуйте методы для добавления и удаления курсов из этого списка.

//    Задание 4: Инкапсуляция и валидация данных
//    Тема: Проверка данных в POJO классах.

//            Описание: Усовершенствуйте классы Student и Course, добавив
//    проверку входящих данных в сеттерах (например, возраст студента
//    не может быть отрицательным, а название курса не может быть пустым).
//    Также реализуйте методы для получения полного списка студентов определенного
//    курса и наоборот.

//    Задание 2.1: Реализация интерфейса Comparable
//    Тема: Основы интерфейса Comparable.
//            Описание: Добавьте в класс Student реализацию интерфейса Comparable<Student>.
//    Студенты должны сравниваться по возрасту. В методе main создайте список студентов,
//    отсортируйте его и выведите результат.

//    Задание 2.2: Использование компаратора для сортировки
//    Тема: Кастомная сортировка с Comparator.
//    Описание: Создайте Comparator<Student> для сортировки списка студентов по фамилии.
//    В методе main добавьте студентов в список, отсортируйте его с использованием созданного
//    компаратора и выведите результат.
    //    Задание 3.3: Комбинированное использование Comparable и Comparator
//    Тема: Сложные критерии сортировки.
//            Описание: Расширьте класс Student, реализовав в нем сортировку по имени,
//    если возраст студентов одинаков.
//    Создайте два компаратора: один для сортировки
//    по имени и другой для сортировки по возрасту и последующей сортировке по имени.
//    Демонстрируйте использование в main с выводом результатов.

    private String firstName;
    private String lastName;
    private int age;
    private List<Course> courses;

    @Override
    public int compareTo(Student otherStudents) {
        if (this.age == otherStudents.getAge()) {
            return this.getFirstName().compareTo(otherStudents.getFirstName());
        }
        return this.age - otherStudents.getAge();
    }


    public Student(String firstName, String lastName, int age, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }


    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Ошибка: переданный возраст не может быть отрицательным");
        }
        this.age = age;
    }

    // Методы для работы со списком курсов
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Ошибка: переданный курс равен null");
        }
        courses.add(course);
    }

    public void removeCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Ошибка: переданный курс равен null");
        }
        courses.remove(course);
    }

    public static List<Course> countCourses(Student student) {
        return student.getCourses();
    }
}

class StudentLastNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getLastName().compareTo(o1.getLastName());
    }
}

class StudentFirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}

class StudentAgeNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getAge() == o1.getAge()) {
            return o2.getFirstName().compareTo(o1.getFirstName());
        }
        return o1.getAge() - o2.getAge();
    }
}

//    Задание 4: Сортировка по нескольким полям с помощью Comparator
//    Тема: Многоуровневая сортировка.
//    Описание: Используя Comparator, реализуйте сортировку студентов сначала по фамилии,
//    затем по имени, а затем по возрасту.
//    В методе main отсортируйте список студентов и выведите его.
class StudentLastNameFirstNameAgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (!o1.getLastName().equals(o2.getLastName())) {
            return o2.getLastName().compareTo(o1.getLastName());
        }
        if (!o1.getFirstName().equals(o2.getFirstName())) {
            return o2.getFirstName().compareTo(o1.getFirstName());
        }
        return o1.getAge() - o2.getAge();
    }
}
