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
    //
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Electro"));
        courses.add(new Course("C1"));
        courses.add(new Course("C2"));
        students.add(new Student("Sergey", "Strukov", 30, courses));
        students.add(new Student("Misha", "Mikhailov", 32, courses));
        students.add(new Student("Misha", "Mikhailov", 18, courses));
        students.add(new Student("Dimas", "Petrovich", 21, courses));
        students.add(new Student("Arsen", "Antonov", 21, courses));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
        }
//        System.out.println("---------");
//        Comparator<Student> comparator = new StudentLastNameComparator();
//        students.sort(comparator);
//        System.out.println("Сортировка по фамилии:");
//        for (Student student : students) {
//            System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getAge());
//        }
//        Collections.sort(students, new StudentFirstNameComparator());
//        System.out.println("Сортировка по имени:");
//        for (Student student : students) {
//            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
//        }
//        Collections.sort(students, new StudentAgeNameComparator());
//        System.out.println("Сортировка по возрасту и последующая сортировка по имени:");
//        for (Student student : students) {
//            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
//        }
//        Collections.sort(students, new StudentLastNameFirstNameAgeComparator());
//        System.out.println("Сортировка студентов сначала по фамилии, затем по имени, а затем по возрасту.");
//        for (Student student : students) {
//            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getAge());
//        }
        List<Group> groups = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        groups.add(new Group("N521", students));
        groups.add(new Group("A521", students2));
        groups.add(new Group("E121", students3));
        students2.add(new Student("Sergey", "Strukov", 30, courses));
        students2.add(new Student("Misha", "Zen", 32, courses));
        students2.add(new Student("Misha", "Mikhailov", 18, courses));
        students3.add(new Student("Slava", "Petrov", 20, courses));
        students3.add(new Student("Misha", "Vasiliev", 32, courses));
        students3.add(new Student("Masha", "Mikhailova", 48, courses));
        Collections.sort(groups);
        Collections.sort(students2);
        Collections.sort(students3);

        for (Group group : groups) {
            System.out.println(group.getGroupName());
            for (Student student : group.getStudents()) {
                System.out.println(student.getFirstName() + student.getAge());
            }
        }
    }
}

