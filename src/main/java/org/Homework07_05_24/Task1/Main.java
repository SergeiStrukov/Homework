package org.Homework07_05_24.Task1;

import java.util.*;

public class Main {
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
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Electro"));
        courses.add(new Course("C1"));
        courses.add(new Course("C2"));
        students.add(new Student("Sergey", "Strukov", 30, courses));
        students.add(new Student("Misha", "Mikhailov", 32, courses));
        students.add(new Student("Petya", "Petrov", 18, courses));
        students.add(new Student("Dimas", "Petrovich", 21, courses));
        students.add(new Student("Arsen", "Antonov", 21, courses));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
        }
        System.out.println("---------");
        Comparator<Student> comparator = new StudentComparator();
        students.sort(comparator);
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getAge());
        }
    }
}
